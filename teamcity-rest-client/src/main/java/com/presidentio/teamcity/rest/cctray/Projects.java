
package com.presidentio.teamcity.rest.cctray;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for projects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="projects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="activity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *                 &lt;attribute name="lastBuildStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *                 &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projects", propOrder = {
    "project"
})
public class Projects {

    @XmlElement(name = "Project", required = true)
    protected List<Projects.Project> project;

    /**
     * Gets the value of the project property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the project property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Projects.Project }
     * 
     * 
     */
    public List<Projects.Project> getProject() {
        if (project == null) {
            project = new ArrayList<Projects.Project>();
        }
        return this.project;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="activity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="lastBuildLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
     *       &lt;attribute name="lastBuildStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="lastBuildTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
     *       &lt;attribute name="nextBuildTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="webUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Project {

        @XmlAttribute(name = "activity", required = true)
        protected String activity;
        @XmlAttribute(name = "lastBuildLabel", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String lastBuildLabel;
        @XmlAttribute(name = "lastBuildStatus", required = true)
        protected String lastBuildStatus;
        @XmlAttribute(name = "lastBuildTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastBuildTime;
        @XmlAttribute(name = "name", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String name;
        @XmlAttribute(name = "nextBuildTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar nextBuildTime;
        @XmlAttribute(name = "webUrl", required = true)
        protected String webUrl;

        /**
         * Gets the value of the activity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivity() {
            return activity;
        }

        /**
         * Sets the value of the activity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivity(String value) {
            this.activity = value;
        }

        /**
         * Gets the value of the lastBuildLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastBuildLabel() {
            return lastBuildLabel;
        }

        /**
         * Sets the value of the lastBuildLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastBuildLabel(String value) {
            this.lastBuildLabel = value;
        }

        /**
         * Gets the value of the lastBuildStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastBuildStatus() {
            return lastBuildStatus;
        }

        /**
         * Sets the value of the lastBuildStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastBuildStatus(String value) {
            this.lastBuildStatus = value;
        }

        /**
         * Gets the value of the lastBuildTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastBuildTime() {
            return lastBuildTime;
        }

        /**
         * Sets the value of the lastBuildTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastBuildTime(XMLGregorianCalendar value) {
            this.lastBuildTime = value;
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
         * Gets the value of the nextBuildTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNextBuildTime() {
            return nextBuildTime;
        }

        /**
         * Sets the value of the nextBuildTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNextBuildTime(XMLGregorianCalendar value) {
            this.nextBuildTime = value;
        }

        /**
         * Gets the value of the webUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebUrl() {
            return webUrl;
        }

        /**
         * Sets the value of the webUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebUrl(String value) {
            this.webUrl = value;
        }

    }

}
