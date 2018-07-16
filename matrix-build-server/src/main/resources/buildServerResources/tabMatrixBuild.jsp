<%@ page import="jetbrains.buildServer.serverSide.SBuild" %>
<%--
* Copyright 2015 presidentio
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bs" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="q" tagdir="/WEB-INF/tags/queue" %>
<jsp:useBean id="serverTC" type="jetbrains.buildServer.serverSide.SBuildServer" scope="request"/>
<jsp:useBean id="report" type="com.presidentio.teamcity.matrix.build.common.dto.Report" scope="request"/>


<style type="text/css">
    td.duration span.progressDuration {
        color: #888;
    }
</style>

<c:choose>
    <c:when test="${error != null}">
        ${error}
    </c:when>
    <c:otherwise>
        <table cellspacing="0" class="dark borderBottom">
            <thead>
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <c:forEach items="${report.parameters}" var="parameterEntry">
                    <th>${parameterEntry.key}</th>
                </c:forEach>
            </tr>
            </thead>
            <c:forEach items="${report.builds}" var="reportBuild">
                <tr>
                    <c:set var="queuedBuild" value="${serverTC.queue.findQueued(reportBuild.buildId.toString())}"/>
                    <c:choose>
                        <c:when test="${queuedBuild != null}">
                            <td></td>
                            <td>
                                <bs:queuedBuildIcon promotion="${queuedBuild.buildPromotion}"/>
                                <q:queueLink queuedBuild="${queuedBuild}"
                                             noPopup="true">#${queuedBuild.orderNumber}</q:queueLink>
                            </td>
                            <td class="estimate">
                                <c:set var="estimates" value="${queuedBuild.buildEstimates}"/>
                                <c:choose>
                                    <c:when test="${not empty estimates}">
                                        <c:set var="estimatedStart">
                                            <c:if test="${not empty estimates.timeInterval && estimates.timeInterval.startPoint != neverInterval}">
                                                ${estimates.timeInterval.startPoint.relativeSeconds > 0 ? "Will start" : "Should have started"}
                                                <bs:date value="${estimates.timeInterval.startPoint.absoluteTime}"
                                                         smart="true"/>
                                                ${estimates.delayed ? "<em>(delayed)</em>" : ""}
                                            </c:if>
                                        </c:set>
                                        ${not empty estimatedStart? estimatedStart : 'Start time unknown'}
                                        <em>${not empty estimates.waitReason ? estimates.waitReason.description : ""}</em>
                                    </c:when>
                                    <c:otherwise>No estimate yet</c:otherwise>
                                </c:choose>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <c:set var="sBuild" value="${serverTC.findBuildInstanceById(reportBuild.buildId)}"
                                   scope="request"/>
                            <td><bs:buildNumber buildData="${sBuild}" withLink="${false}"/></td>
                            <td>
                                <c:set var="resultText">
                                    <bs:trim maxlength="100">${sBuild.statusDescriptor.text}</bs:trim>
                                </c:set>
                                <bs:buildDataIcon buildData="${sBuild}"
                                                  imgId="build:${reportBuild.buildId}:img"/>
                                <bs:resultsLink build="${sBuild}" skipChangesArtifacts="true">
                                    <span id="build:${reportBuild.buildId}:text">
                                        <bs:makeBreakable text="${resultText}" regex="[\.,\\/:;@%^]" escape="${false}"/>
                                    </span>
                                </bs:resultsLink>
                            </td>
                            <td class="duration">
                                <bs:buildProgress buildData="${sBuild}"/>
                            </td>
                        </c:otherwise>
                    </c:choose>
                    <c:forEach items="${report.parameters}" var="parameterEntry">
                        <td>${reportBuild.parameters.get(parameterEntry.key)}</td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>