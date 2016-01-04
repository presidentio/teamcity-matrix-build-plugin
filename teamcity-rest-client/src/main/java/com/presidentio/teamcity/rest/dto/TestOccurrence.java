
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testOccurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testOccurrence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ignoreDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}test" minOccurs="0"/&gt;
 *         &lt;element name="mute" type="{http://dto.rest.teamcity.presidentio.com}mute" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}build" minOccurs="0"/&gt;
 *         &lt;element name="firstFailed" type="{http://dto.rest.teamcity.presidentio.com}testOccurrence" minOccurs="0"/&gt;
 *         &lt;element name="nextFixed" type="{http://dto.rest.teamcity.presidentio.com}testOccurrence" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="muted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="currentlyMuted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="currentlyInvestigated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testOccurrence", propOrder = {
    "ignoreDetails",
    "details",
    "test",
    "mute",
    "build",
    "firstFailed",
    "nextFixed"
})
public class TestOccurrence {

    protected String ignoreDetails;
    protected String details;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Test test;
    protected Mute mute;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Build build;
    protected TestOccurrence firstFailed;
    protected TestOccurrence nextFixed;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "ignored")
    protected Boolean ignored;
    @XmlAttribute(name = "duration")
    protected Integer duration;
    @XmlAttribute(name = "muted")
    protected Boolean muted;
    @XmlAttribute(name = "currentlyMuted")
    protected Boolean currentlyMuted;
    @XmlAttribute(name = "currentlyInvestigated")
    protected Boolean currentlyInvestigated;
    @XmlAttribute(name = "href")
    protected String href;

    /**
     * Gets the value of the ignoreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreDetails() {
        return ignoreDetails;
    }

    /**
     * Sets the value of the ignoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreDetails(String value) {
        this.ignoreDetails = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Test }
     *     
     */
    public Test getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test }
     *     
     */
    public void setTest(Test value) {
        this.test = value;
    }

    /**
     * Gets the value of the mute property.
     * 
     * @return
     *     possible object is
     *     {@link Mute }
     *     
     */
    public Mute getMute() {
        return mute;
    }

    /**
     * Sets the value of the mute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mute }
     *     
     */
    public void setMute(Mute value) {
        this.mute = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link Build }
     *     
     */
    public Build getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build }
     *     
     */
    public void setBuild(Build value) {
        this.build = value;
    }

    /**
     * Gets the value of the firstFailed property.
     * 
     * @return
     *     possible object is
     *     {@link TestOccurrence }
     *     
     */
    public TestOccurrence getFirstFailed() {
        return firstFailed;
    }

    /**
     * Sets the value of the firstFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOccurrence }
     *     
     */
    public void setFirstFailed(TestOccurrence value) {
        this.firstFailed = value;
    }

    /**
     * Gets the value of the nextFixed property.
     * 
     * @return
     *     possible object is
     *     {@link TestOccurrence }
     *     
     */
    public TestOccurrence getNextFixed() {
        return nextFixed;
    }

    /**
     * Sets the value of the nextFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOccurrence }
     *     
     */
    public void setNextFixed(TestOccurrence value) {
        this.nextFixed = value;
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
     * Gets the value of the ignored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnored() {
        return ignored;
    }

    /**
     * Sets the value of the ignored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnored(Boolean value) {
        this.ignored = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the muted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMuted() {
        return muted;
    }

    /**
     * Sets the value of the muted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMuted(Boolean value) {
        this.muted = value;
    }

    /**
     * Gets the value of the currentlyMuted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentlyMuted() {
        return currentlyMuted;
    }

    /**
     * Sets the value of the currentlyMuted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentlyMuted(Boolean value) {
        this.currentlyMuted = value;
    }

    /**
     * Gets the value of the currentlyInvestigated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentlyInvestigated() {
        return currentlyInvestigated;
    }

    /**
     * Sets the value of the currentlyInvestigated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentlyInvestigated(Boolean value) {
        this.currentlyInvestigated = value;
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
