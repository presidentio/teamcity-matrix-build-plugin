
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcsRootEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcsRootEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}vcsRoot" minOccurs="0"/&gt;
 *         &lt;element name="checkout-rules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsRootEntry", propOrder = {
    "vcsRoot",
    "checkoutRules"
})
public class VcsRootEntry {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected VcsRoot vcsRoot;
    @XmlElement(name = "checkout-rules")
    protected String checkoutRules;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the vcsRoot property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRoot }
     *     
     */
    public VcsRoot getVcsRoot() {
        return vcsRoot;
    }

    /**
     * Sets the value of the vcsRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRoot }
     *     
     */
    public void setVcsRoot(VcsRoot value) {
        this.vcsRoot = value;
    }

    /**
     * Gets the value of the checkoutRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutRules() {
        return checkoutRules;
    }

    /**
     * Sets the value of the checkoutRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutRules(String value) {
        this.checkoutRules = value;
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

}
