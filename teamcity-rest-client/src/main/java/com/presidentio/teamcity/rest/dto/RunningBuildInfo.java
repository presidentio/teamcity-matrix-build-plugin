
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runningBuildInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runningBuildInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="percentageComplete" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="elapsedSeconds" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="estimatedTotalSeconds" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="currentStageText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="outdated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="probablyHanging" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runningBuildInfo")
public class RunningBuildInfo {

    @XmlAttribute(name = "percentageComplete")
    protected Integer percentageComplete;
    @XmlAttribute(name = "elapsedSeconds", required = true)
    protected long elapsedSeconds;
    @XmlAttribute(name = "estimatedTotalSeconds")
    protected Long estimatedTotalSeconds;
    @XmlAttribute(name = "currentStageText")
    protected String currentStageText;
    @XmlAttribute(name = "outdated", required = true)
    protected boolean outdated;
    @XmlAttribute(name = "probablyHanging", required = true)
    protected boolean probablyHanging;

    /**
     * Gets the value of the percentageComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    /**
     * Sets the value of the percentageComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentageComplete(Integer value) {
        this.percentageComplete = value;
    }

    /**
     * Gets the value of the elapsedSeconds property.
     * 
     */
    public long getElapsedSeconds() {
        return elapsedSeconds;
    }

    /**
     * Sets the value of the elapsedSeconds property.
     * 
     */
    public void setElapsedSeconds(long value) {
        this.elapsedSeconds = value;
    }

    /**
     * Gets the value of the estimatedTotalSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedTotalSeconds() {
        return estimatedTotalSeconds;
    }

    /**
     * Sets the value of the estimatedTotalSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedTotalSeconds(Long value) {
        this.estimatedTotalSeconds = value;
    }

    /**
     * Gets the value of the currentStageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStageText() {
        return currentStageText;
    }

    /**
     * Sets the value of the currentStageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStageText(String value) {
        this.currentStageText = value;
    }

    /**
     * Gets the value of the outdated property.
     * 
     */
    public boolean isOutdated() {
        return outdated;
    }

    /**
     * Sets the value of the outdated property.
     * 
     */
    public void setOutdated(boolean value) {
        this.outdated = value;
    }

    /**
     * Gets the value of the probablyHanging property.
     * 
     */
    public boolean isProbablyHanging() {
        return probablyHanging;
    }

    /**
     * Sets the value of the probablyHanging property.
     * 
     */
    public void setProbablyHanging(boolean value) {
        this.probablyHanging = value;
    }

}
