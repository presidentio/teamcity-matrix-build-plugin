
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newProjectDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newProjectDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.rest.teamcity.presidentio.com}copyOptionsDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceProject" type="{http://dto.rest.teamcity.presidentio.com}project" minOccurs="0"/&gt;
 *         &lt;element name="parentProject" type="{http://dto.rest.teamcity.presidentio.com}project" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sourceProjectLocator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newProjectDescription", propOrder = {
    "sourceProject",
    "parentProject"
})
public class NewProjectDescription
    extends CopyOptionsDescription
{

    protected Project sourceProject;
    protected Project parentProject;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "sourceProjectLocator")
    protected String sourceProjectLocator;

    /**
     * Gets the value of the sourceProject property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getSourceProject() {
        return sourceProject;
    }

    /**
     * Sets the value of the sourceProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setSourceProject(Project value) {
        this.sourceProject = value;
    }

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
     * Gets the value of the sourceProjectLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceProjectLocator() {
        return sourceProjectLocator;
    }

    /**
     * Sets the value of the sourceProjectLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceProjectLocator(String value) {
        this.sourceProjectLocator = value;
    }

}
