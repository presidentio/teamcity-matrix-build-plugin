
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copyOptionsDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyOptionsDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectsIdsMap" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="buildTypesIdsMap" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *         &lt;element name="vcsRootsIdsMap" type="{http://dto.rest.teamcity.presidentio.com}properties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="copyAllAssociatedSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyOptionsDescription", propOrder = {
    "projectsIdsMap",
    "buildTypesIdsMap",
    "vcsRootsIdsMap"
})
@XmlSeeAlso({
    NewBuildTypeDescription.class,
    NewProjectDescription.class
})
public class CopyOptionsDescription {

    protected Properties projectsIdsMap;
    protected Properties buildTypesIdsMap;
    protected Properties vcsRootsIdsMap;
    @XmlAttribute(name = "copyAllAssociatedSettings")
    protected Boolean copyAllAssociatedSettings;

    /**
     * Gets the value of the projectsIdsMap property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProjectsIdsMap() {
        return projectsIdsMap;
    }

    /**
     * Sets the value of the projectsIdsMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProjectsIdsMap(Properties value) {
        this.projectsIdsMap = value;
    }

    /**
     * Gets the value of the buildTypesIdsMap property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getBuildTypesIdsMap() {
        return buildTypesIdsMap;
    }

    /**
     * Sets the value of the buildTypesIdsMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setBuildTypesIdsMap(Properties value) {
        this.buildTypesIdsMap = value;
    }

    /**
     * Gets the value of the vcsRootsIdsMap property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getVcsRootsIdsMap() {
        return vcsRootsIdsMap;
    }

    /**
     * Sets the value of the vcsRootsIdsMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setVcsRootsIdsMap(Properties value) {
        this.vcsRootsIdsMap = value;
    }

    /**
     * Gets the value of the copyAllAssociatedSettings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyAllAssociatedSettings() {
        return copyAllAssociatedSettings;
    }

    /**
     * Sets the value of the copyAllAssociatedSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyAllAssociatedSettings(Boolean value) {
        this.copyAllAssociatedSettings = value;
    }

}
