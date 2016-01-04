
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for server complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="server"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projects" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="vcsRoots" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="builds" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="users" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="userGroups" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="agents" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="buildQueue" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *         &lt;element name="agentPools" type="{http://dto.rest.teamcity.presidentio.com}HReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="versionMajor" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *       &lt;attribute name="versionMinor" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *       &lt;attribute name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="currentTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="buildNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="buildDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "server", propOrder = {
    "projects",
    "vcsRoots",
    "builds",
    "users",
    "userGroups",
    "agents",
    "buildQueue",
    "agentPools"
})
public class Server {

    protected HReference projects;
    protected HReference vcsRoots;
    protected HReference builds;
    protected HReference users;
    protected HReference userGroups;
    protected HReference agents;
    protected HReference buildQueue;
    protected HReference agentPools;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "versionMajor", required = true)
    protected byte versionMajor;
    @XmlAttribute(name = "versionMinor", required = true)
    protected byte versionMinor;
    @XmlAttribute(name = "startTime")
    protected String startTime;
    @XmlAttribute(name = "currentTime")
    protected String currentTime;
    @XmlAttribute(name = "buildNumber")
    protected String buildNumber;
    @XmlAttribute(name = "buildDate")
    protected String buildDate;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setProjects(HReference value) {
        this.projects = value;
    }

    /**
     * Gets the value of the vcsRoots property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getVcsRoots() {
        return vcsRoots;
    }

    /**
     * Sets the value of the vcsRoots property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setVcsRoots(HReference value) {
        this.vcsRoots = value;
    }

    /**
     * Gets the value of the builds property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getBuilds() {
        return builds;
    }

    /**
     * Sets the value of the builds property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setBuilds(HReference value) {
        this.builds = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setUsers(HReference value) {
        this.users = value;
    }

    /**
     * Gets the value of the userGroups property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getUserGroups() {
        return userGroups;
    }

    /**
     * Sets the value of the userGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setUserGroups(HReference value) {
        this.userGroups = value;
    }

    /**
     * Gets the value of the agents property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getAgents() {
        return agents;
    }

    /**
     * Sets the value of the agents property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setAgents(HReference value) {
        this.agents = value;
    }

    /**
     * Gets the value of the buildQueue property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getBuildQueue() {
        return buildQueue;
    }

    /**
     * Sets the value of the buildQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setBuildQueue(HReference value) {
        this.buildQueue = value;
    }

    /**
     * Gets the value of the agentPools property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getAgentPools() {
        return agentPools;
    }

    /**
     * Sets the value of the agentPools property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setAgentPools(HReference value) {
        this.agentPools = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionMajor property.
     * 
     */
    public byte getVersionMajor() {
        return versionMajor;
    }

    /**
     * Sets the value of the versionMajor property.
     * 
     */
    public void setVersionMajor(byte value) {
        this.versionMajor = value;
    }

    /**
     * Gets the value of the versionMinor property.
     * 
     */
    public byte getVersionMinor() {
        return versionMinor;
    }

    /**
     * Sets the value of the versionMinor property.
     * 
     */
    public void setVersionMinor(byte value) {
        this.versionMinor = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTime(String value) {
        this.currentTime = value;
    }

    /**
     * Gets the value of the buildNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * Sets the value of the buildNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildNumber(String value) {
        this.buildNumber = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDate(String value) {
        this.buildDate = value;
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

}
