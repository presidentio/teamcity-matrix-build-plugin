
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for build complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="build"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}buildType" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://dto.rest.teamcity.presidentio.com}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}tags" minOccurs="0"/&gt;
 *         &lt;element name="pinInfo" type="{http://dto.rest.teamcity.presidentio.com}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}user" minOccurs="0"/&gt;
 *         &lt;element name="startEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="running-info" type="{http://dto.rest.teamcity.presidentio.com}runningBuildInfo" minOccurs="0"/&gt;
 *         &lt;element name="canceledInfo" type="{http://dto.rest.teamcity.presidentio.com}comment" minOccurs="0"/&gt;
 *         &lt;element name="queuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="finishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="triggered" type="{http://dto.rest.teamcity.presidentio.com}triggeredBy" minOccurs="0"/&gt;
 *         &lt;element name="lastChanges" type="{http://dto.rest.teamcity.presidentio.com}changes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}changes" minOccurs="0"/&gt;
 *         &lt;element name="revisions" type="{http://dto.rest.teamcity.presidentio.com}revisions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}agent" minOccurs="0"/&gt;
 *         &lt;element name="compatibleAgents" type="{http://dto.rest.teamcity.presidentio.com}agents-ref" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}testOccurrences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}problemOccurrences" minOccurs="0"/&gt;
 *         &lt;element name="artifacts" type="{http://dto.rest.teamcity.presidentio.com}files" minOccurs="0"/&gt;
 *         &lt;element name="relatedIssues" type="{http://dto.rest.teamcity.presidentio.com}issueUsages" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="attributes" type="{http://dto.rest.teamcity.presidentio.com}entries" minOccurs="0"/&gt;
 *         &lt;element name="statistics" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="snapshot-dependencies" type="{http://dto.rest.teamcity.presidentio.com}builds" minOccurs="0"/&gt;
 *         &lt;element name="artifact-dependencies" type="{http://dto.rest.teamcity.presidentio.com}builds" minOccurs="0"/&gt;
 *         &lt;element name="custom-artifact-dependencies" type="{http://dto.rest.teamcity.presidentio.com}propEntitiesArtifactDep" minOccurs="0"/&gt;
 *         &lt;element name="triggeringOptions" type="{http://dto.rest.teamcity.presidentio.com}buildTriggeringOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="taskId" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="buildTypeId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="buildTypeInternalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="running" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="failedToStart" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="personal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="percentageComplete" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="defaultBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="unspecifiedBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="history" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="pinned" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "build", propOrder = {
    "statusText",
    "buildType",
    "comment",
    "tags",
    "pinInfo",
    "user",
    "startEstimate",
    "waitReason",
    "runningInfo",
    "canceledInfo",
    "queuedDate",
    "startDate",
    "finishDate",
    "triggered",
    "lastChanges",
    "changes",
    "revisions",
    "agent",
    "compatibleAgents",
    "testOccurrences",
    "problemOccurrences",
    "artifacts",
    "relatedIssues",
    "properties",
    "attributes",
    "statistics",
    "snapshotDependencies",
    "artifactDependencies",
    "customArtifactDependencies",
    "triggeringOptions"
})
@XmlRootElement
public class Build {

    protected String statusText;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected BuildType buildType;
    @XmlElement(defaultValue = "")
    protected Comment comment;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Tags tags;
    protected Comment pinInfo;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected User user;
    protected String startEstimate;
    protected String waitReason;
    @XmlElement(name = "running-info")
    protected RunningBuildInfo runningInfo;
    protected Comment canceledInfo;
    protected String queuedDate;
    protected String startDate;
    protected String finishDate;
    protected TriggeredBy triggered;
    protected Changes lastChanges;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Changes changes;
    protected Revisions revisions;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Agent agent;
    protected AgentsRef compatibleAgents;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected TestOccurrences testOccurrences;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected ProblemOccurrences problemOccurrences;
    protected Files artifacts;
    protected IssueUsages relatedIssues;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Properties properties;
    protected Entries attributes;
    protected Properties statistics;
    @XmlElement(name = "snapshot-dependencies")
    protected Builds snapshotDependencies;
    @XmlElement(name = "artifact-dependencies")
    protected Builds artifactDependencies;
    @XmlElement(name = "custom-artifact-dependencies")
    protected PropEntitiesArtifactDep customArtifactDependencies;
    protected BuildTriggeringOptions triggeringOptions;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "taskId")
    protected Long taskId;
    @XmlAttribute(name = "buildTypeId")
    protected String buildTypeId;
    @XmlAttribute(name = "buildTypeInternalId")
    protected String buildTypeInternalId;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "running")
    protected Boolean running;
    @XmlAttribute(name = "failedToStart")
    protected Boolean failedToStart;
    @XmlAttribute(name = "personal")
    protected Boolean personal;
    @XmlAttribute(name = "percentageComplete")
    protected Integer percentageComplete;
    @XmlAttribute(name = "branchName")
    protected String branchName;
    @XmlAttribute(name = "defaultBranch")
    protected Boolean defaultBranch;
    @XmlAttribute(name = "unspecifiedBranch")
    protected Boolean unspecifiedBranch;
    @XmlAttribute(name = "history")
    protected Boolean history;
    @XmlAttribute(name = "pinned")
    protected Boolean pinned;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;
    @XmlAttribute(name = "locator")
    protected String locator;

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

    /**
     * Gets the value of the buildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildType }
     *     
     */
    public BuildType getBuildType() {
        return buildType;
    }

    /**
     * Sets the value of the buildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildType }
     *     
     */
    public void setBuildType(BuildType value) {
        this.buildType = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the pinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getPinInfo() {
        return pinInfo;
    }

    /**
     * Sets the value of the pinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setPinInfo(Comment value) {
        this.pinInfo = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the startEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartEstimate() {
        return startEstimate;
    }

    /**
     * Sets the value of the startEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartEstimate(String value) {
        this.startEstimate = value;
    }

    /**
     * Gets the value of the waitReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitReason() {
        return waitReason;
    }

    /**
     * Sets the value of the waitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitReason(String value) {
        this.waitReason = value;
    }

    /**
     * Gets the value of the runningInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RunningBuildInfo }
     *     
     */
    public RunningBuildInfo getRunningInfo() {
        return runningInfo;
    }

    /**
     * Sets the value of the runningInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunningBuildInfo }
     *     
     */
    public void setRunningInfo(RunningBuildInfo value) {
        this.runningInfo = value;
    }

    /**
     * Gets the value of the canceledInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getCanceledInfo() {
        return canceledInfo;
    }

    /**
     * Sets the value of the canceledInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setCanceledInfo(Comment value) {
        this.canceledInfo = value;
    }

    /**
     * Gets the value of the queuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueuedDate() {
        return queuedDate;
    }

    /**
     * Sets the value of the queuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueuedDate(String value) {
        this.queuedDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishDate(String value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the triggered property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredBy }
     *     
     */
    public TriggeredBy getTriggered() {
        return triggered;
    }

    /**
     * Sets the value of the triggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredBy }
     *     
     */
    public void setTriggered(TriggeredBy value) {
        this.triggered = value;
    }

    /**
     * Gets the value of the lastChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Changes }
     *     
     */
    public Changes getLastChanges() {
        return lastChanges;
    }

    /**
     * Sets the value of the lastChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Changes }
     *     
     */
    public void setLastChanges(Changes value) {
        this.lastChanges = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link Changes }
     *     
     */
    public Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Changes }
     *     
     */
    public void setChanges(Changes value) {
        this.changes = value;
    }

    /**
     * Gets the value of the revisions property.
     * 
     * @return
     *     possible object is
     *     {@link Revisions }
     *     
     */
    public Revisions getRevisions() {
        return revisions;
    }

    /**
     * Sets the value of the revisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revisions }
     *     
     */
    public void setRevisions(Revisions value) {
        this.revisions = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setAgent(Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the compatibleAgents property.
     * 
     * @return
     *     possible object is
     *     {@link AgentsRef }
     *     
     */
    public AgentsRef getCompatibleAgents() {
        return compatibleAgents;
    }

    /**
     * Sets the value of the compatibleAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentsRef }
     *     
     */
    public void setCompatibleAgents(AgentsRef value) {
        this.compatibleAgents = value;
    }

    /**
     * Gets the value of the testOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link TestOccurrences }
     *     
     */
    public TestOccurrences getTestOccurrences() {
        return testOccurrences;
    }

    /**
     * Sets the value of the testOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOccurrences }
     *     
     */
    public void setTestOccurrences(TestOccurrences value) {
        this.testOccurrences = value;
    }

    /**
     * Gets the value of the problemOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemOccurrences }
     *     
     */
    public ProblemOccurrences getProblemOccurrences() {
        return problemOccurrences;
    }

    /**
     * Sets the value of the problemOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemOccurrences }
     *     
     */
    public void setProblemOccurrences(ProblemOccurrences value) {
        this.problemOccurrences = value;
    }

    /**
     * Gets the value of the artifacts property.
     * 
     * @return
     *     possible object is
     *     {@link Files }
     *     
     */
    public Files getArtifacts() {
        return artifacts;
    }

    /**
     * Sets the value of the artifacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Files }
     *     
     */
    public void setArtifacts(Files value) {
        this.artifacts = value;
    }

    /**
     * Gets the value of the relatedIssues property.
     * 
     * @return
     *     possible object is
     *     {@link IssueUsages }
     *     
     */
    public IssueUsages getRelatedIssues() {
        return relatedIssues;
    }

    /**
     * Sets the value of the relatedIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueUsages }
     *     
     */
    public void setRelatedIssues(IssueUsages value) {
        this.relatedIssues = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Entries }
     *     
     */
    public Entries getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entries }
     *     
     */
    public void setAttributes(Entries value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setStatistics(Properties value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the snapshotDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Builds }
     *     
     */
    public Builds getSnapshotDependencies() {
        return snapshotDependencies;
    }

    /**
     * Sets the value of the snapshotDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Builds }
     *     
     */
    public void setSnapshotDependencies(Builds value) {
        this.snapshotDependencies = value;
    }

    /**
     * Gets the value of the artifactDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Builds }
     *     
     */
    public Builds getArtifactDependencies() {
        return artifactDependencies;
    }

    /**
     * Sets the value of the artifactDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Builds }
     *     
     */
    public void setArtifactDependencies(Builds value) {
        this.artifactDependencies = value;
    }

    /**
     * Gets the value of the customArtifactDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesArtifactDep }
     *     
     */
    public PropEntitiesArtifactDep getCustomArtifactDependencies() {
        return customArtifactDependencies;
    }

    /**
     * Sets the value of the customArtifactDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesArtifactDep }
     *     
     */
    public void setCustomArtifactDependencies(PropEntitiesArtifactDep value) {
        this.customArtifactDependencies = value;
    }

    /**
     * Gets the value of the triggeringOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTriggeringOptions }
     *     
     */
    public BuildTriggeringOptions getTriggeringOptions() {
        return triggeringOptions;
    }

    /**
     * Sets the value of the triggeringOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTriggeringOptions }
     *     
     */
    public void setTriggeringOptions(BuildTriggeringOptions value) {
        this.triggeringOptions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskId(Long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the buildTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildTypeId() {
        return buildTypeId;
    }

    /**
     * Sets the value of the buildTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildTypeId(String value) {
        this.buildTypeId = value;
    }

    /**
     * Gets the value of the buildTypeInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildTypeInternalId() {
        return buildTypeInternalId;
    }

    /**
     * Sets the value of the buildTypeInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildTypeInternalId(String value) {
        this.buildTypeInternalId = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the running property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunning(Boolean value) {
        this.running = value;
    }

    /**
     * Gets the value of the failedToStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailedToStart() {
        return failedToStart;
    }

    /**
     * Sets the value of the failedToStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailedToStart(Boolean value) {
        this.failedToStart = value;
    }

    /**
     * Gets the value of the personal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonal() {
        return personal;
    }

    /**
     * Sets the value of the personal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonal(Boolean value) {
        this.personal = value;
    }

    /**
     * Gets the value of the percentageComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    /**
     * Sets the value of the percentageComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentageComplete(Integer value) {
        this.percentageComplete = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the defaultBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Sets the value of the defaultBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultBranch(Boolean value) {
        this.defaultBranch = value;
    }

    /**
     * Gets the value of the unspecifiedBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnspecifiedBranch() {
        return unspecifiedBranch;
    }

    /**
     * Sets the value of the unspecifiedBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnspecifiedBranch(Boolean value) {
        this.unspecifiedBranch = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistory(Boolean value) {
        this.history = value;
    }

    /**
     * Gets the value of the pinned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPinned() {
        return pinned;
    }

    /**
     * Sets the value of the pinned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPinned(Boolean value) {
        this.pinned = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

    /**
     * Gets the value of the locator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

}
