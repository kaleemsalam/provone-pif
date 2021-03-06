//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:00:21 PM CET 
//


package org.kit.scufl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A dispatch layer, identified by Java class name.
 * 			
 * 
 * <p>Java class for DispatchLayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispatchLayer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="raven" type="{http://taverna.sf.net/2008/xml/t2flow}Raven" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="configBean" type="{http://taverna.sf.net/2008/xml/t2flow}ConfigBean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispatchLayer", propOrder = {
    "raven",
    "clazz",
    "configBean"
})
public class DispatchLayer {

    @XmlElement(namespace = "http://taverna.sf.net/2008/xml/t2flow")
    protected Raven raven;
    @XmlElement(name = "class", namespace = "http://taverna.sf.net/2008/xml/t2flow", required = true)
    protected String clazz;
    @XmlElement(namespace = "http://taverna.sf.net/2008/xml/t2flow", required = true)
    protected ConfigBean configBean;

    /**
     * Gets the value of the raven property.
     * 
     * @return
     *     possible object is
     *     {@link Raven }
     *     
     */
    public Raven getRaven() {
        return raven;
    }

    /**
     * Sets the value of the raven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Raven }
     *     
     */
    public void setRaven(Raven value) {
        this.raven = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the configBean property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigBean }
     *     
     */
    public ConfigBean getConfigBean() {
        return configBean;
    }

    /**
     * Sets the value of the configBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigBean }
     *     
     */
    public void setConfigBean(ConfigBean value) {
        this.configBean = value;
    }

}
