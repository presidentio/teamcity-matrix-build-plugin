
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}vcsRootInstance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="internalVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revision", propOrder = {
    "vcsRootInstance"
})
public class Revision {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected VcsRootInstance vcsRootInstance;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "internalVersion")
    protected String internalVersion;

    /**
     * Gets the value of the vcsRootInstance property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRootInstance }
     *     
     */
    public VcsRootInstance getVcsRootInstance() {
        return vcsRootInstance;
    }

    /**
     * Sets the value of the vcsRootInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRootInstance }
     *     
     */
    public void setVcsRootInstance(VcsRootInstance value) {
        this.vcsRootInstance = value;
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
     * Gets the value of the internalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalVersion() {
        return internalVersion;
    }

    /**
     * Sets the value of the internalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalVersion(String value) {
        this.internalVersion = value;
    }

}
