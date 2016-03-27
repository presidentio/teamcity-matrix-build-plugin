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
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="settings" class="com.presidentio.teamcity.matrix.build.common.cons.SettingsConst"/>
<jsp:useBean id="serverTC" type="jetbrains.buildServer.serverSide.SBuildServer" scope="request"/>

<l:settingsGroup title="Matrix Build Options">
    <props:hiddenProperty name="${settings.PROP_TEAMCITY_SERVER_URL}" value="%teamcity.serverUrl%"/>
    <tr>
        <th><label for="${settings.PROP_BUILD_TYPE_ID}">Build type: <l:star/></label></th>
        <td>
            <props:selectProperty name="${settings.PROP_BUILD_TYPE_ID}" id="${settings.PROP_BUILD_TYPE_ID}"
                                  multiple="false">
                <c:forEach var="buildType" items="${serverTC.projectManager.activeBuildTypes}">
                    <props:option value="${buildType.internalId}"><c:out
                            value="${buildType.projectName} > ${buildType.name}"/></props:option>
                </c:forEach>
            </props:selectProperty>
            <span class="error" id="error_${settings.PROP_BUILD_TYPE_ID}"></span>
            <span class="smallNote">Build configuration to run with custom parameters</span>
        </td>
    </tr>
    <tr>
        <th><label for="${settings.PROP_BUILD_PARAMETERS}">Build parameters: <l:star/></label></th>
        <td>
            <props:multilineProperty name="${settings.PROP_BUILD_PARAMETERS}" rows="10"
                                     cols="58"
                                     linkTitle="Build parameters"
                                     className="longField"
                                     expanded="true"/>
            <span class="error" id="error_${settings.PROP_BUILD_PARAMETERS}"></span>
            <span class="smallNote">A newline-separated list of properties with comma separated variants of value: &lt;parameter name&gt;=&lt;value1&gt;,&lt;value2&gt;,&lt;value3&gt;</span>
        </td>
    </tr>
    <tr>
        <th><label for="${settings.PROP_CONST_BUILD_PARAMETERS}">Const build parameters: <l:star/></label></th>
        <td>
            <props:multilineProperty name="${settings.PROP_CONST_BUILD_PARAMETERS}" rows="10"
                                     cols="58"
                                     linkTitle="Const build parameters"
                                     className="longField"
                                     expanded="true"/>
            <span class="error" id="error_${settings.PROP_CONST_BUILD_PARAMETERS}"></span>
            <span class="smallNote">A newline-separated list of properties</span>
        </td>
    </tr>
    <tr>
        <th><label for="${settings.PROP_TEAMCITY_SERVER_USERNAME}">Username: <l:star/></label></th>
        <td>
            <props:textProperty name="${settings.PROP_TEAMCITY_SERVER_USERNAME}"/>
            <span class="error" id="error_${settings.PROP_TEAMCITY_SERVER_USERNAME}"></span>
            <span class="smallNote">Username</span>
        </td>
    </tr>

    <tr>
        <th><label for="${settings.PROP_TEAMCITY_SERVER_PASSWORD}">User password: <l:star/></label></th>
        <td>
            <props:passwordProperty name="${settings.PROP_TEAMCITY_SERVER_PASSWORD}"/>
            <span class="error" id="error_${settings.PROP_TEAMCITY_SERVER_PASSWORD}"></span>
            <span class="smallNote">User password</span>
        </td>
    </tr>
    <%--
    replace previous two properties with this after will be fixed https://youtrack.jetbrains.com/issue/TW-39206
    <props:hiddenProperty name="${settings.PROP_TEAMCITY_SERVER_USERNAME}" value="%system.teamcity.auth.userId%"/>
    <props:hiddenProperty name="${settings.PROP_TEAMCITY_SERVER_PASSWORD}" value="%system.teamcity.auth.password%"/>
    --%>

    <tr class="advancedSetting">
        <th><label for="${settings.PROP_ONLY_DIAGONAL}">Only diagonal: </label></th>
        <td>
            <props:checkboxProperty name="${settings.PROP_ONLY_DIAGONAL}"/>
            <span class="error" id="error_${settings.PROP_ONLY_DIAGONAL}"></span>
            <span class="smallNote">Use only diagonal combinations of parameters</span>
        </td>
    </tr>

    <tr class="advancedSetting">
        <th><label for="${settings.PROP_WAIT_BUILDS_FINISH}">Wait builds finish: </label></th>
        <td>
            <props:checkboxProperty name="${settings.PROP_WAIT_BUILDS_FINISH}"/>
            <span class="error" id="error_${settings.PROP_WAIT_BUILDS_FINISH}"></span>
            <span class="smallNote">Waits while all child build will be finished</span>
        </td>
    </tr>
</l:settingsGroup>
