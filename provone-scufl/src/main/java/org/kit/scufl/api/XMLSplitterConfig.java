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
 * <p>Java class for XMLSplitterConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLSplitterConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="wrappedTypeXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputs" type="{http://taverna.sf.net/2008/xml/t2activities}ActivityInputPorts"/>
 *         &lt;element name="outputs" type="{http://taverna.sf.net/2008/xml/t2activities}ActivityOutputPorts"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLSplitterConfig", namespace = "http://taverna.sf.net/2008/xml/t2activities", propOrder = {

})
public class XMLSplitterConfig {

    @XmlElement(required = true)
    protected String wrappedTypeXML;
    @XmlElement(required = true)
    protected ActivityInputPorts inputs;
    @XmlElement(required = true)
    protected ActivityOutputPorts outputs;

    /**
     * Gets the value of the wrappedTypeXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrappedTypeXML() {
        return wrappedTypeXML;
    }

    /**
     * Sets the value of the wrappedTypeXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrappedTypeXML(String value) {
        this.wrappedTypeXML = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInputPorts }
     *     
     */
    public ActivityInputPorts getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInputPorts }
     *     
     */
    public void setInputs(ActivityInputPorts value) {
        this.inputs = value;
    }

    /**
     * Gets the value of the outputs property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityOutputPorts }
     *     
     */
    public ActivityOutputPorts getOutputs() {
        return outputs;
    }

    /**
     * Sets the value of the outputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityOutputPorts }
     *     
     */
    public void setOutputs(ActivityOutputPorts value) {
        this.outputs = value;
    }

}
