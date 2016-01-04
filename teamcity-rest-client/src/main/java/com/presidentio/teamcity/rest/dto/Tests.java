
package com.presidentio.teamcity.rest.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tests"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}test" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="nextHref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prevHref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tests", propOrder = {
    "test"
})
public class Tests {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected List<Test> test;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "nextHref")
    protected String nextHref;
    @XmlAttribute(name = "prevHref")
    protected String prevHref;

    /**
     * Gets the value of the test property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the test property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Test }
     * 
     * 
     */
    public List<Test> getTest() {
        if (test == null) {
            test = new ArrayList<Test>();
        }
        return this.test;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the nextHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextHref() {
        return nextHref;
    }

    /**
     * Sets the value of the nextHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextHref(String value) {
        this.nextHref = value;
    }

    /**
     * Gets the value of the prevHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevHref() {
        return prevHref;
    }

    /**
     * Sets the value of the prevHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevHref(String value) {
        this.prevHref = value;
    }

}
