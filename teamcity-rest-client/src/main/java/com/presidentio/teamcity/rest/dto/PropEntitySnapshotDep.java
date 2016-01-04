
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propEntitySnapshotDep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propEntitySnapshotDep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.rest.teamcity.presidentio.com}propEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source-buildType" type="{http://dto.rest.teamcity.presidentio.com}buildType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propEntitySnapshotDep", propOrder = {
    "sourceBuildType"
})
public class PropEntitySnapshotDep
    extends PropEntity
{

    @XmlElement(name = "source-buildType")
    protected BuildType sourceBuildType;

    /**
     * Gets the value of the sourceBuildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildType }
     *     
     */
    public BuildType getSourceBuildType() {
        return sourceBuildType;
    }

    /**
     * Sets the value of the sourceBuildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildType }
     *     
     */
    public void setSourceBuildType(BuildType value) {
        this.sourceBuildType = value;
    }

}
