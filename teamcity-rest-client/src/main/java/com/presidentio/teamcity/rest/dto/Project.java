
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parentProject" type="{http://dto.rest.teamcity.presidentio.com}project" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}buildTypes" minOccurs="0"/&gt;
 *         &lt;element name="templates" type="{http://dto.rest.teamcity.presidentio.com}buildTypes" minOccurs="0"/&gt;
 *         &lt;element name="parameters" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="vcsRoots" type="{http://dto.rest.teamcity.presidentio.com}vcsRoots" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}projects" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parentProjectId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parentProjectInternalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parentProjectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "project", propOrder = {
    "parentProject",
    "buildTypes",
    "templates",
    "parameters",
    "vcsRoots",
    "projects"
})
public class Project {

    protected Project parentProject;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected BuildTypes buildTypes;
    protected BuildTypes templates;
    protected Properties parameters;
    protected VcsRoots vcsRoots;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Projects projects;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "uuid")
    protected String uuid;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "parentProjectId")
    protected String parentProjectId;
    @XmlAttribute(name = "parentProjectInternalId")
    protected String parentProjectInternalId;
    @XmlAttribute(name = "parentProjectName")
    protected String parentProjectName;
    @XmlAttribute(name = "archived")
    protected Boolean archived;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;
    @XmlAttribute(name = "locator")
    protected String locator;

    /**
     * Gets the value of the parentProject property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getParentProject() {
        return parentProject;
    }

    /**
     * Sets the value of the parentProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setParentProject(Project value) {
        this.parentProject = value;
    }

    /**
     * Gets the value of the buildTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getBuildTypes() {
        return buildTypes;
    }

    /**
     * Sets the value of the buildTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setBuildTypes(BuildTypes value) {
        this.buildTypes = value;
    }

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setTemplates(BuildTypes value) {
        this.templates = value;
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
     * Gets the value of the vcsRoots property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRoots }
     *     
     */
    public VcsRoots getVcsRoots() {
        return vcsRoots;
    }

    /**
     * Sets the value of the vcsRoots property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRoots }
     *     
     */
    public void setVcsRoots(VcsRoots value) {
        this.vcsRoots = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link Projects }
     *     
     */
    public Projects getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Projects }
     *     
     */
    public void setProjects(Projects value) {
        this.projects = value;
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
     * Gets the value of the parentProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProjectId() {
        return parentProjectId;
    }

    /**
     * Sets the value of the parentProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProjectId(String value) {
        this.parentProjectId = value;
    }

    /**
     * Gets the value of the parentProjectInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProjectInternalId() {
        return parentProjectInternalId;
    }

    /**
     * Sets the value of the parentProjectInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProjectInternalId(String value) {
        this.parentProjectInternalId = value;
    }

    /**
     * Gets the value of the parentProjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProjectName() {
        return parentProjectName;
    }

    /**
     * Sets the value of the parentProjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProjectName(String value) {
        this.parentProjectName = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
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
