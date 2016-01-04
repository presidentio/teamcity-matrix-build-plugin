
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compatibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compatibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}agent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}buildType" minOccurs="0"/&gt;
 *         &lt;element name="unmetRequirements" type="{http://dto.rest.teamcity.presidentio.com}requirements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="compatible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compatibility", propOrder = {
    "agent",
    "buildType",
    "unmetRequirements"
})
public class Compatibility {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Agent agent;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected BuildType buildType;
    protected Requirements unmetRequirements;
    @XmlAttribute(name = "compatible")
    protected Boolean compatible;

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
     * Gets the value of the unmetRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link Requirements }
     *     
     */
    public Requirements getUnmetRequirements() {
        return unmetRequirements;
    }

    /**
     * Sets the value of the unmetRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requirements }
     *     
     */
    public void setUnmetRequirements(Requirements value) {
        this.unmetRequirements = value;
    }

    /**
     * Gets the value of the compatible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompatible() {
        return compatible;
    }

    /**
     * Sets the value of the compatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompatible(Boolean value) {
        this.compatible = value;
    }

}
