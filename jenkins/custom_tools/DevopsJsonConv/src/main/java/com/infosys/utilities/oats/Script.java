/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.12 at 03:15:49 PM IST 
//


package com.infosys.utilities.oats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i18nProperty">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="recid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Initialize">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Finish">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="iterationNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reportTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="testDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workspace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "i18NProperty",
    "initialize",
    "finish"
})
@XmlRootElement(name = "Script")
public class Script {

    @XmlElement(name = "i18nProperty", required = true)
    protected Script.I18NProperty i18NProperty;
    @XmlElement(name = "Initialize", required = true)
    protected Script.Initialize initialize;
    @XmlElement(name = "Finish", required = true)
    protected Script.Finish finish;
    @XmlAttribute(name = "duration")
    protected Integer duration;
    @XmlAttribute(name = "iterationNum")
    protected Integer iterationNum;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "reportTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportTime;
    @XmlAttribute(name = "result")
    protected String result;
    @XmlAttribute(name = "testDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testDate;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "workspace")
    protected String workspace;

    /**
     * Gets the value of the i18NProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Script.I18NProperty }
     *     
     */
    public Script.I18NProperty getI18NProperty() {
        return i18NProperty;
    }

    /**
     * Sets the value of the i18NProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script.I18NProperty }
     *     
     */
    public void setI18NProperty(Script.I18NProperty value) {
        this.i18NProperty = value;
    }

    /**
     * Gets the value of the initialize property.
     * 
     * @return
     *     possible object is
     *     {@link Script.Initialize }
     *     
     */
    public Script.Initialize getInitialize() {
        return initialize;
    }

    /**
     * Sets the value of the initialize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script.Initialize }
     *     
     */
    public void setInitialize(Script.Initialize value) {
        this.initialize = value;
    }

    /**
     * Gets the value of the finish property.
     * 
     * @return
     *     possible object is
     *     {@link Script.Finish }
     *     
     */
    public Script.Finish getFinish() {
        return finish;
    }

    /**
     * Sets the value of the finish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script.Finish }
     *     
     */
    public void setFinish(Script.Finish value) {
        this.finish = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the iterationNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIterationNum() {
        return iterationNum;
    }

    /**
     * Sets the value of the iterationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIterationNum(Integer value) {
        this.iterationNum = value;
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
     * Gets the value of the reportTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportTime() {
        return reportTime;
    }

    /**
     * Sets the value of the reportTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportTime(XMLGregorianCalendar value) {
        this.reportTime = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the testDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDate() {
        return testDate;
    }

    /**
     * Sets the value of the testDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDate(XMLGregorianCalendar value) {
        this.testDate = value;
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
     * Gets the value of the workspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkspace() {
        return workspace;
    }

    /**
     * Sets the value of the workspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkspace(String value) {
        this.workspace = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Finish {

        @XmlAttribute(name = "duration")
        protected Integer duration;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "result")
        protected String result;
        @XmlAttribute(name = "summary")
        protected String summary;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDuration(Integer value) {
            this.duration = value;
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
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResult(String value) {
            this.result = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSummary(String value) {
            this.summary = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="recid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class I18NProperty {

        @XmlAttribute(name = "duration")
        protected String duration;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "recid")
        protected String recid;
        @XmlAttribute(name = "result")
        protected String result;
        @XmlAttribute(name = "summary")
        protected String summary;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
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
         * Gets the value of the recid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecid() {
            return recid;
        }

        /**
         * Sets the value of the recid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecid(String value) {
            this.recid = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResult(String value) {
            this.result = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSummary(String value) {
            this.summary = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Initialize {

        @XmlAttribute(name = "duration")
        protected Integer duration;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "result")
        protected String result;
        @XmlAttribute(name = "summary")
        protected String summary;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDuration(Integer value) {
            this.duration = value;
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
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResult(String value) {
            this.result = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSummary(String value) {
            this.summary = value;
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

    }

}
