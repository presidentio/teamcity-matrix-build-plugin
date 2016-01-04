
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newBuildTypeDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newBuildTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.rest.teamcity.presidentio.com}copyOptionsDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceBuildType" type="{http://dto.rest.teamcity.presidentio.com}buildType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sourceBuildTypeLocator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newBuildTypeDescription", propOrder = {
    "sourceBuildType"
})
public class NewBuildTypeDescription
    extends CopyOptionsDescription
{

    protected BuildType sourceBuildType;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "sourceBuildTypeLocator")
    protected String sourceBuildTypeLocator;

    /**
     * Gets the value of the sourceBuildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildType }
     *     
     */
    public BuildType getSourceBuildType() {
        return sourceBuildType;
    }

    /**
     * Sets the value of the sourceBuildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildType }
     *     
     */
    public void setSourceBuildType(BuildType value) {
        this.sourceBuildType = value;
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
     * Gets the value of the sourceBuildTypeLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBuildTypeLocator() {
        return sourceBuildTypeLocator;
    }

    /**
     * Sets the value of the sourceBuildTypeLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBuildTypeLocator(String value) {
        this.sourceBuildTypeLocator = value;
    }

}
