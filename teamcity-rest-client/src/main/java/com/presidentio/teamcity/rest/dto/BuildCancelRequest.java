
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for buildCancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buildCancelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="readdIntoQueue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buildCancelRequest")
@XmlRootElement
public class BuildCancelRequest {

    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "readdIntoQueue", required = true)
    protected boolean readdIntoQueue;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the readdIntoQueue property.
     * 
     */
    public boolean isReaddIntoQueue() {
        return readdIntoQueue;
    }

    /**
     * Sets the value of the readdIntoQueue property.
     * 
     */
    public void setReaddIntoQueue(boolean value) {
        this.readdIntoQueue = value;
    }

}
