
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for vcsRootEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcsRootEntries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}vcsRootEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsRootEntries", propOrder = {
    "vcsRootEntry"
})
public class VcsRootEntries {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected List<VcsRootEntry> vcsRootEntry;
    @XmlAttribute(name = "count")
    protected Integer count;

    /**
     * Gets the value of the vcsRootEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcsRootEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcsRootEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VcsRootEntry }
     * 
     * 
     */
    public List<VcsRootEntry> getVcsRootEntry() {
        if (vcsRootEntry == null) {
            vcsRootEntry = new ArrayList<VcsRootEntry>();
        }
        return this.vcsRootEntry;
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

}
