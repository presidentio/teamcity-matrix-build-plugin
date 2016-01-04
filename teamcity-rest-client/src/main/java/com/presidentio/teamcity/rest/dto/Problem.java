
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="problem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}mutes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}investigations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}problemOccurrences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="identity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "problem", propOrder = {
    "mutes",
    "investigations",
    "problemOccurrences"
})
public class Problem {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Mutes mutes;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Investigations investigations;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected ProblemOccurrences problemOccurrences;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "identity")
    protected String identity;
    @XmlAttribute(name = "href")
    protected String href;

    /**
     * Gets the value of the mutes property.
     * 
     * @return
     *     possible object is
     *     {@link Mutes }
     *     
     */
    public Mutes getMutes() {
        return mutes;
    }

    /**
     * Sets the value of the mutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mutes }
     *     
     */
    public void setMutes(Mutes value) {
        this.mutes = value;
    }

    /**
     * Gets the value of the investigations property.
     * 
     * @return
     *     possible object is
     *     {@link Investigations }
     *     
     */
    public Investigations getInvestigations() {
        return investigations;
    }

    /**
     * Sets the value of the investigations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Investigations }
     *     
     */
    public void setInvestigations(Investigations value) {
        this.investigations = value;
    }

    /**
     * Gets the value of the problemOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemOccurrences }
     *     
     */
    public ProblemOccurrences getProblemOccurrences() {
        return problemOccurrences;
    }

    /**
     * Sets the value of the problemOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemOccurrences }
     *     
     */
    public void setProblemOccurrences(ProblemOccurrences value) {
        this.problemOccurrences = value;
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

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
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
