
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for occurrencesSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="occurrencesSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="passed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="failed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="newFailed" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="muted" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "occurrencesSummary")
@XmlSeeAlso({
    ProblemOccurrences.class,
    TestOccurrences.class
})
public class OccurrencesSummary {

    @XmlAttribute(name = "passed")
    protected Integer passed;
    @XmlAttribute(name = "failed")
    protected Integer failed;
    @XmlAttribute(name = "newFailed")
    protected Integer newFailed;
    @XmlAttribute(name = "ignored")
    protected Integer ignored;
    @XmlAttribute(name = "muted")
    protected Integer muted;

    /**
     * Gets the value of the passed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassed() {
        return passed;
    }

    /**
     * Sets the value of the passed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassed(Integer value) {
        this.passed = value;
    }

    /**
     * Gets the value of the failed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailed(Integer value) {
        this.failed = value;
    }

    /**
     * Gets the value of the newFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewFailed() {
        return newFailed;
    }

    /**
     * Sets the value of the newFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewFailed(Integer value) {
        this.newFailed = value;
    }

    /**
     * Gets the value of the ignored property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnored() {
        return ignored;
    }

    /**
     * Sets the value of the ignored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnored(Integer value) {
        this.ignored = value;
    }

    /**
     * Gets the value of the muted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMuted() {
        return muted;
    }

    /**
     * Sets the value of the muted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMuted(Integer value) {
        this.muted = value;
    }

}
