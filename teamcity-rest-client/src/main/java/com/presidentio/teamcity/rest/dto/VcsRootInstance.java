
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcsRootInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcsRootInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}vcsRoot" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vcs-root-id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vcsRootInternalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vcsName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastChecked" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastVersionInternal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="projectLocator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsRootInstance", propOrder = {
    "vcsRoot",
    "properties"
})
public class VcsRootInstance {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected VcsRoot vcsRoot;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Properties properties;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "vcs-root-id")
    protected String vcsRootId;
    @XmlAttribute(name = "vcsRootInternalId")
    protected String vcsRootInternalId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "vcsName")
    protected String vcsName;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "lastChecked")
    protected String lastChecked;
    @XmlAttribute(name = "lastVersion")
    protected String lastVersion;
    @XmlAttribute(name = "lastVersionInternal")
    protected String lastVersionInternal;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "projectLocator")
    protected String projectLocator;

    /**
     * Gets the value of the vcsRoot property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRoot }
     *     
     */
    public VcsRoot getVcsRoot() {
        return vcsRoot;
    }

    /**
     * Sets the value of the vcsRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRoot }
     *     
     */
    public void setVcsRoot(VcsRoot value) {
        this.vcsRoot = value;
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
     * Gets the value of the vcsRootId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsRootId() {
        return vcsRootId;
    }

    /**
     * Sets the value of the vcsRootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsRootId(String value) {
        this.vcsRootId = value;
    }

    /**
     * Gets the value of the vcsRootInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsRootInternalId() {
        return vcsRootInternalId;
    }

    /**
     * Sets the value of the vcsRootInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsRootInternalId(String value) {
        this.vcsRootInternalId = value;
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
     * Gets the value of the lastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVersion() {
        return lastVersion;
    }

    /**
     * Sets the value of the lastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVersion(String value) {
        this.lastVersion = value;
    }

    /**
     * Gets the value of the lastVersionInternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVersionInternal() {
        return lastVersionInternal;
    }

    /**
     * Sets the value of the lastVersionInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVersionInternal(String value) {
        this.lastVersionInternal = value;
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

}
