
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="test"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}mutes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}investigations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}testOccurrences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", propOrder = {
    "mutes",
    "investigations",
    "testOccurrences"
})
public class Test {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Mutes mutes;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Investigations investigations;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected TestOccurrences testOccurrences;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "name")
    protected String name;
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
     * Gets the value of the testOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link TestOccurrences }
     *     
     */
    public TestOccurrences getTestOccurrences() {
        return testOccurrences;
    }

    /**
     * Sets the value of the testOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOccurrences }
     *     
     */
    public void setTestOccurrences(TestOccurrences value) {
        this.testOccurrences = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
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
