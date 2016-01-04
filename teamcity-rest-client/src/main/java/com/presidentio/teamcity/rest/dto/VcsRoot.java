
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcsRoot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}project" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="vcsRootInstances" type="{http://dto.rest.teamcity.presidentio.com}vcsRootInstances" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vcsName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modificationCheckInterval" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastChecked" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="projectLocator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsRoot", propOrder = {
    "project",
    "properties",
    "vcsRootInstances"
})
public class VcsRoot {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Project project;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Properties properties;
    protected VcsRootInstances vcsRootInstances;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "internalId")
    protected Long internalId;
    @XmlAttribute(name = "uuid")
    protected String uuid;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "vcsName")
    protected String vcsName;
    @XmlAttribute(name = "modificationCheckInterval")
    protected Integer modificationCheckInterval;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "lastChecked")
    protected String lastChecked;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "projectLocator")
    protected String projectLocator;
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
     * Gets the value of the vcsRootInstances property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRootInstances }
     *     
     */
    public VcsRootInstances getVcsRootInstances() {
        return vcsRootInstances;
    }

    /**
     * Sets the value of the vcsRootInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRootInstances }
     *     
     */
    public void setVcsRootInstances(VcsRootInstances value) {
        this.vcsRootInstances = value;
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
     *     {@link Long }
     *     
     */
    public Long getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInternalId(Long value) {
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
     * Gets the value of the vcsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsName() {
        return vcsName;
    }

    /**
     * Sets the value of the vcsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsName(String value) {
        this.vcsName = value;
    }

    /**
     * Gets the value of the modificationCheckInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModificationCheckInterval() {
        return modificationCheckInterval;
    }

    /**
     * Sets the value of the modificationCheckInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModificationCheckInterval(Integer value) {
        this.modificationCheckInterval = value;
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
     * Gets the value of the lastChecked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChecked() {
        return lastChecked;
    }

    /**
     * Sets the value of the lastChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChecked(String value) {
        this.lastChecked = value;
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
     * Gets the value of the projectLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectLocator() {
        return projectLocator;
    }

    /**
     * Sets the value of the projectLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectLocator(String value) {
        this.projectLocator = value;
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
