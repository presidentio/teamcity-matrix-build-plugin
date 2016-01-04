
package com.presidentio.teamcity.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="problemTarget"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}tests" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dto.rest.teamcity.presidentio.com}problems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="anyProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "problemTarget", propOrder = {
    "tests",
    "problems"
})
public class ProblemTarget {

    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Tests tests;
    @XmlElement(namespace = "http://dto.rest.teamcity.presidentio.com")
    protected Problems problems;
    @XmlAttribute(name = "anyProblem")
    protected Boolean anyProblem;

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link Tests }
     *     
     */
    public Tests getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tests }
     *     
     */
    public void setTests(Tests value) {
        this.tests = value;
    }

    /**
     * Gets the value of the problems property.
     * 
     * @return
     *     possible object is
     *     {@link Problems }
     *     
     */
    public Problems getProblems() {
        return problems;
    }

    /**
     * Sets the value of the problems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Problems }
     *     
     */
    public void setProblems(Problems value) {
        this.problems = value;
    }

    /**
     * Gets the value of the anyProblem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyProblem() {
        return anyProblem;
    }

    /**
     * Sets the value of the anyProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnyProblem(Boolean value) {
        this.anyProblem = value;
    }

}
