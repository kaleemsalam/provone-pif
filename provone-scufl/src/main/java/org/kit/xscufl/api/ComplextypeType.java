//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.09 at 03:17:22 PM CET 
//


package org.kit.xscufl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complextypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complextypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elements" type="{http://org.embl.ebi.escience/xscufl/0.1alpha}elementsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unbounded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complextypeType", propOrder = {
    "elements"
})
public class ComplextypeType {

    @XmlElement(required = true)
    protected ElementsType elements;
    @XmlAttribute(name = "optional")
    protected String optional;
    @XmlAttribute(name = "unbounded")
    protected String unbounded;
    @XmlAttribute(name = "typename")
    protected String typename;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "qname")
    protected String qname;

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link ElementsType }
     *     
     */
    public ElementsType getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementsType }
     *     
     */
    public void setElements(ElementsType value) {
        this.elements = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptional(String value) {
        this.optional = value;
    }

    /**
     * Gets the value of the unbounded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnbounded() {
        return unbounded;
    }

    /**
     * Sets the value of the unbounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnbounded(String value) {
        this.unbounded = value;
    }

    /**
     * Gets the value of the typename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypename() {
        return typename;
    }

    /**
     * Sets the value of the typename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypename(String value) {
        this.typename = value;
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
     * Gets the value of the qname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQname() {
        return qname;
    }

    /**
     * Sets the value of the qname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQname(String value) {
        this.qname = value;
    }

}
