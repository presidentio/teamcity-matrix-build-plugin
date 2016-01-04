
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buildType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}project" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{http://dto.rest.teamcity.presidentio.com}buildType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}vcsRootEntries" minOccurs="0"/&gt;
 *         &lt;element name="settings" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="parameters" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}steps" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}features" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}triggers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}snapshot-dependencies" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}artifact-dependencies" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}agent-requirements" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}builds" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}investigations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="templateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="paused" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="projectInternalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "buildType", propOrder = {
    "project",
    "template",
    "vcsRootEntries",
    "settings",
    "parameters",
    "steps",
    "features",
    "triggers",
    "snapshotDependencies",
    "artifactDependencies",
    "agentRequirements",
    "builds",
    "investigations"
})
public class BuildType {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Project project;
    protected BuildType template;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected VcsRootEntries vcsRootEntries;
    protected Properties settings;
    protected Properties parameters;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected PropEntitiesStep steps;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected PropEntitiesFeature features;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected PropEntitiesTrigger triggers;
    @XmlElement(name = "snapshot-dependencies", namespace = "http://dto.rest.teamcity.presidentio.com")
    protected PropEntitiesSnapshotDep snapshotDependencies;
    @XmlElement(name = "artifact-dependencies", namespace = "http://dto.rest.teamcity.presidentio.com")
    protected PropEntitiesArtifactDep artifactDependencies;
    @XmlElement(name = "agent-requirements", namespace = "http://dto.rest.teamcity.presidentio.com")
    protected PropEntitiesAgentRequirement agentRequirements;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Builds builds;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Investigations investigations;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "templateFlag")
    protected Boolean templateFlag;
    @XmlAttribute(name = "paused")
    protected Boolean paused;
    @XmlAttribute(name = "uuid")
    protected String uuid;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "projectName")
    protected String projectName;
    @XmlAttribute(name = "projectId")
    protected String projectId;
    @XmlAttribute(name = "projectInternalId")
    protected String projectInternalId;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;
    @XmlAttribute(name = "locator")
    protected String locator;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link BuildType }
     *     
     */
    public BuildType getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildType }
     *     
     */
    public void setTemplate(BuildType value) {
        this.template = value;
    }

    /**
     * Gets the value of the vcsRootEntries property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRootEntries }
     *     
     */
    public VcsRootEntries getVcsRootEntries() {
        return vcsRootEntries;
    }

    /**
     * Sets the value of the vcsRootEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRootEntries }
     *     
     */
    public void setVcsRootEntries(VcsRootEntries value) {
        this.vcsRootEntries = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setSettings(Properties value) {
        this.settings = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setParameters(Properties value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesStep }
     *     
     */
    public PropEntitiesStep getSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesStep }
     *     
     */
    public void setSteps(PropEntitiesStep value) {
        this.steps = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesFeature }
     *     
     */
    public PropEntitiesFeature getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesFeature }
     *     
     */
    public void setFeatures(PropEntitiesFeature value) {
        this.features = value;
    }

    /**
     * Gets the value of the triggers property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesTrigger }
     *     
     */
    public PropEntitiesTrigger getTriggers() {
        return triggers;
    }

    /**
     * Sets the value of the triggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesTrigger }
     *     
     */
    public void setTriggers(PropEntitiesTrigger value) {
        this.triggers = value;
    }

    /**
     * Gets the value of the snapshotDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesSnapshotDep }
     *     
     */
    public PropEntitiesSnapshotDep getSnapshotDependencies() {
        return snapshotDependencies;
    }

    /**
     * Sets the value of the snapshotDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesSnapshotDep }
     *     
     */
    public void setSnapshotDependencies(PropEntitiesSnapshotDep value) {
        this.snapshotDependencies = value;
    }

    /**
     * Gets the value of the artifactDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesArtifactDep }
     *     
     */
    public PropEntitiesArtifactDep getArtifactDependencies() {
        return artifactDependencies;
    }

    /**
     * Sets the value of the artifactDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesArtifactDep }
     *     
     */
    public void setArtifactDependencies(PropEntitiesArtifactDep value) {
        this.artifactDependencies = value;
    }

    /**
     * Gets the value of the agentRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesAgentRequirement }
     *     
     */
    public PropEntitiesAgentRequirement getAgentRequirements() {
        return agentRequirements;
    }

    /**
     * Sets the value of the agentRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesAgentRequirement }
     *     
     */
    public void setAgentRequirements(PropEntitiesAgentRequirement value) {
        this.agentRequirements = value;
    }

    /**
     * Gets the value of the builds property.
     * 
     * @return
     *     possible object is
     *     {@link Builds }
     *     
     */
    public Builds getBuilds() {
        return builds;
    }

    /**
     * Sets the value of the builds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Builds }
     *     
     */
    public void setBuilds(Builds value) {
        this.builds = value;
    }

    /**
     * Gets the value of the investigations property.
     * 
     * @return
     *     possible object is
     *     {@link Investigations }
     *     
     */
    public Investigations getInvestigations() {
        return investigations;
    }

    /**
     * Sets the value of the investigations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Investigations }
     *     
     */
    public void setInvestigations(Investigations value) {
        this.investigations = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the templateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemplateFlag() {
        return templateFlag;
    }

    /**
     * Sets the value of the templateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplateFlag(Boolean value) {
        this.templateFlag = value;
    }

    /**
     * Gets the value of the paused property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaused() {
        return paused;
    }

    /**
     * Sets the value of the paused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaused(Boolean value) {
        this.paused = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectInternalId() {
        return projectInternalId;
    }

    /**
     * Sets the value of the projectInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectInternalId(String value) {
        this.projectInternalId = value;
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
