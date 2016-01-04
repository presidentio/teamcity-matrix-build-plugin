
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fileChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="before-revision" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="after-revision" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="relative-file" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileChange")
public class FileChange {

    @XmlAttribute(name = "before-revision")
    protected String beforeRevision;
    @XmlAttribute(name = "after-revision")
    protected String afterRevision;
    @XmlAttribute(name = "file")
    protected String file;
    @XmlAttribute(name = "relative-file")
    protected String relativeFile;

    /**
     * Gets the value of the beforeRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeforeRevision() {
        return beforeRevision;
    }

    /**
     * Sets the value of the beforeRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeforeRevision(String value) {
        this.beforeRevision = value;
    }

    /**
     * Gets the value of the afterRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterRevision() {
        return afterRevision;
    }

    /**
     * Sets the value of the afterRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterRevision(String value) {
        this.afterRevision = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the relativeFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeFile() {
        return relativeFile;
    }

    /**
     * Sets the value of the relativeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeFile(String value) {
        this.relativeFile = value;
    }

}
