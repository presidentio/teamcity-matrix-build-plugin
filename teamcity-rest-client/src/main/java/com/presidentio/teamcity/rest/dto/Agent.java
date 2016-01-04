
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="pool" type="{http://dto.rest.teamcity.presidentio.com}agentPool" minOccurs="0"/&gt;
 *         &lt;element name="compatibleBuildTypes" type="{http://dto.rest.teamcity.presidentio.com}buildTypes" minOccurs="0"/&gt;
 *         &lt;element name="incompatibleBuildTypes" type="{http://dto.rest.teamcity.presidentio.com}compatibilities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="connected" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="authorized" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="uptodate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="locator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {
    "properties",
    "pool",
    "compatibleBuildTypes",
    "incompatibleBuildTypes"
})
public class Agent {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Properties properties;
    protected AgentPool pool;
    protected BuildTypes compatibleBuildTypes;
    protected Compatibilities incompatibleBuildTypes;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "typeId")
    protected Integer typeId;
    @XmlAttribute(name = "connected")
    protected Boolean connected;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "authorized")
    protected Boolean authorized;
    @XmlAttribute(name = "uptodate")
    protected Boolean uptodate;
    @XmlAttribute(name = "ip")
    protected String ip;
    @XmlAttribute(name = "protocol")
    protected String protocol;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "locator")
    protected String locator;

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
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPool }
     *     
     */
    public AgentPool getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPool }
     *     
     */
    public void setPool(AgentPool value) {
        this.pool = value;
    }

    /**
     * Gets the value of the compatibleBuildTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getCompatibleBuildTypes() {
        return compatibleBuildTypes;
    }

    /**
     * Sets the value of the compatibleBuildTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setCompatibleBuildTypes(BuildTypes value) {
        this.compatibleBuildTypes = value;
    }

    /**
     * Gets the value of the incompatibleBuildTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Compatibilities }
     *     
     */
    public Compatibilities getIncompatibleBuildTypes() {
        return incompatibleBuildTypes;
    }

    /**
     * Sets the value of the incompatibleBuildTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compatibilities }
     *     
     */
    public void setIncompatibleBuildTypes(Compatibilities value) {
        this.incompatibleBuildTypes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnected(Boolean value) {
        this.connected = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorized(Boolean value) {
        this.authorized = value;
    }

    /**
     * Gets the value of the uptodate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUptodate() {
        return uptodate;
    }

    /**
     * Sets the value of the uptodate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUptodate(Boolean value) {
        this.uptodate = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
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
