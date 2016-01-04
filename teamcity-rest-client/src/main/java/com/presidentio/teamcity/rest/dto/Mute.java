
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assignment" type="{http://dto.rest.teamcity.presidentio.com}comment" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://dto.rest.teamcity.presidentio.com}problemScope" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://dto.rest.teamcity.presidentio.com}problemTarget" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://dto.rest.teamcity.presidentio.com}resolution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mute", propOrder = {
    "assignment",
    "scope",
    "target",
    "resolution"
})
public class Mute {

    protected Comment assignment;
    protected ProblemScope scope;
    protected ProblemTarget target;
    protected Resolution resolution;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setAssignment(Comment value) {
        this.assignment = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemScope }
     *     
     */
    public ProblemScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemScope }
     *     
     */
    public void setScope(ProblemScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemTarget }
     *     
     */
    public ProblemTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemTarget }
     *     
     */
    public void setTarget(ProblemTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Resolution }
     *     
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resolution }
     *     
     */
    public void setResolution(Resolution value) {
        this.resolution = value;
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

}
