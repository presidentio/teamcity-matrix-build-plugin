
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcsLabelingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcsLabelingOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="branchFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcsRoots" type="{http://dto.rest.teamcity.presidentio.com}vcsRoots" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="labelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsLabelingOptions", propOrder = {
    "branchFilter",
    "vcsRoots"
})
public class VcsLabelingOptions {

    protected String branchFilter;
    protected VcsRoots vcsRoots;
    @XmlAttribute(name = "labelName")
    protected String labelName;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the branchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchFilter() {
        return branchFilter;
    }

    /**
     * Sets the value of the branchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchFilter(String value) {
        this.branchFilter = value;
    }

    /**
     * Gets the value of the vcsRoots property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRoots }
     *     
     */
    public VcsRoots getVcsRoots() {
        return vcsRoots;
    }

    /**
     * Sets the value of the vcsRoots property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRoots }
     *     
     */
    public void setVcsRoots(VcsRoots value) {
        this.vcsRoots = value;
    }

    /**
     * Gets the value of the labelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * Sets the value of the labelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelName(String value) {
        this.labelName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
