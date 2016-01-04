
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assignee" type="{http://dto.rest.teamcity.presidentio.com}user" minOccurs="0"/&gt;
 *         &lt;element name="assignment" type="{http://dto.rest.teamcity.presidentio.com}comment" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://dto.rest.teamcity.presidentio.com}problemScope" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://dto.rest.teamcity.presidentio.com}problemTarget" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://dto.rest.teamcity.presidentio.com}resolution" minOccurs="0"/&gt;
 *         &lt;element name="responsible" type="{http://dto.rest.teamcity.presidentio.com}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigation", propOrder = {
    "assignee",
    "assignment",
    "scope",
    "target",
    "resolution",
    "responsible"
})
public class Investigation {

    protected User assignee;
    protected Comment assignment;
    protected ProblemScope scope;
    protected ProblemTarget target;
    protected Resolution resolution;
    protected User responsible;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "href")
    protected String href;

    /**
     * Gets the value of the assignee property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAssignee() {
        return assignee;
    }

    /**
     * Sets the value of the assignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAssignee(User value) {
        this.assignee = value;
    }

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
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setResponsible(User value) {
        this.responsible = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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

}
