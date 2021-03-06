//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:00:21 PM CET 
//


package org.kit.scufl.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiConsumerConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiConsumerConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiConsumerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apiConsumerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameterNames" type="{http://taverna.sf.net/2008/xml/t2activities}ApiConsumerParameterNames"/>
 *         &lt;element name="parameterDimensions" type="{http://taverna.sf.net/2008/xml/t2activities}ApiConsumerParameterDimensions"/>
 *         &lt;element name="parameterTypes" type="{http://taverna.sf.net/2008/xml/t2activities}ApiConsumerParameterTypes"/>
 *         &lt;element name="returnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnDimension" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="isMethodStatic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMethodConstructor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classLoaderSharing" type="{http://taverna.sf.net/2008/xml/t2activities}ClassLoaderSharing"/>
 *         &lt;element name="localDependencies" type="{http://taverna.sf.net/2008/xml/t2activities}LocalDependencies"/>
 *         &lt;element name="artifactDependencies" type="{http://taverna.sf.net/2008/xml/t2activities}ArtifactDependencies"/>
 *         &lt;element name="inputs" type="{http://taverna.sf.net/2008/xml/t2activities}ActivityInputPorts"/>
 *         &lt;element name="outputs" type="{http://taverna.sf.net/2008/xml/t2activities}ActivityOutputPorts"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiConsumerConfig", namespace = "http://taverna.sf.net/2008/xml/t2activities", propOrder = {
    "apiConsumerName",
    "apiConsumerDescription",
    "description",
    "className",
    "methodName",
    "parameterNames",
    "parameterDimensions",
    "parameterTypes",
    "returnType",
    "returnDimension",
    "isMethodStatic",
    "isMethodConstructor",
    "classLoaderSharing",
    "localDependencies",
    "artifactDependencies",
    "inputs",
    "outputs"
})
public class ApiConsumerConfig {

    @XmlElement(required = true)
    protected String apiConsumerName;
    @XmlElement(required = true)
    protected String apiConsumerDescription;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String className;
    @XmlElement(required = true)
    protected String methodName;
    @XmlElement(required = true)
    protected ApiConsumerParameterNames parameterNames;
    @XmlElement(required = true)
    protected ApiConsumerParameterDimensions parameterDimensions;
    @XmlElement(required = true)
    protected ApiConsumerParameterTypes parameterTypes;
    @XmlElement(required = true)
    protected String returnType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger returnDimension;
    protected boolean isMethodStatic;
    protected boolean isMethodConstructor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ClassLoaderSharing classLoaderSharing;
    @XmlElement(required = true)
    protected LocalDependencies localDependencies;
    @XmlElement(required = true)
    protected ArtifactDependencies artifactDependencies;
    @XmlElement(required = true)
    protected ActivityInputPorts inputs;
    @XmlElement(required = true)
    protected ActivityOutputPorts outputs;

    /**
     * Gets the value of the apiConsumerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiConsumerName() {
        return apiConsumerName;
    }

    /**
     * Sets the value of the apiConsumerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiConsumerName(String value) {
        this.apiConsumerName = value;
    }

    /**
     * Gets the value of the apiConsumerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiConsumerDescription() {
        return apiConsumerDescription;
    }

    /**
     * Sets the value of the apiConsumerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiConsumerDescription(String value) {
        this.apiConsumerDescription = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the parameterNames property.
     * 
     * @return
     *     possible object is
     *     {@link ApiConsumerParameterNames }
     *     
     */
    public ApiConsumerParameterNames getParameterNames() {
        return parameterNames;
    }

    /**
     * Sets the value of the parameterNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiConsumerParameterNames }
     *     
     */
    public void setParameterNames(ApiConsumerParameterNames value) {
        this.parameterNames = value;
    }

    /**
     * Gets the value of the parameterDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link ApiConsumerParameterDimensions }
     *     
     */
    public ApiConsumerParameterDimensions getParameterDimensions() {
        return parameterDimensions;
    }

    /**
     * Sets the value of the parameterDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiConsumerParameterDimensions }
     *     
     */
    public void setParameterDimensions(ApiConsumerParameterDimensions value) {
        this.parameterDimensions = value;
    }

    /**
     * Gets the value of the parameterTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ApiConsumerParameterTypes }
     *     
     */
    public ApiConsumerParameterTypes getParameterTypes() {
        return parameterTypes;
    }

    /**
     * Sets the value of the parameterTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiConsumerParameterTypes }
     *     
     */
    public void setParameterTypes(ApiConsumerParameterTypes value) {
        this.parameterTypes = value;
    }

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the returnDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnDimension() {
        return returnDimension;
    }

    /**
     * Sets the value of the returnDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnDimension(BigInteger value) {
        this.returnDimension = value;
    }

    /**
     * Gets the value of the isMethodStatic property.
     * 
     */
    public boolean isIsMethodStatic() {
        return isMethodStatic;
    }

    /**
     * Sets the value of the isMethodStatic property.
     * 
     */
    public void setIsMethodStatic(boolean value) {
        this.isMethodStatic = value;
    }

    /**
     * Gets the value of the isMethodConstructor property.
     * 
     */
    public boolean isIsMethodConstructor() {
        return isMethodConstructor;
    }

    /**
     * Sets the value of the isMethodConstructor property.
     * 
     */
    public void setIsMethodConstructor(boolean value) {
        this.isMethodConstructor = value;
    }

    /**
     * Gets the value of the classLoaderSharing property.
     * 
     * @return
     *     possible object is
     *     {@link ClassLoaderSharing }
     *     
     */
    public ClassLoaderSharing getClassLoaderSharing() {
        return classLoaderSharing;
    }

    /**
     * Sets the value of the classLoaderSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassLoaderSharing }
     *     
     */
    public void setClassLoaderSharing(ClassLoaderSharing value) {
        this.classLoaderSharing = value;
    }

    /**
     * Gets the value of the localDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDependencies }
     *     
     */
    public LocalDependencies getLocalDependencies() {
        return localDependencies;
    }

    /**
     * Sets the value of the localDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDependencies }
     *     
     */
    public void setLocalDependencies(LocalDependencies value) {
        this.localDependencies = value;
    }

    /**
     * Gets the value of the artifactDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactDependencies }
     *     
     */
    public ArtifactDependencies getArtifactDependencies() {
        return artifactDependencies;
    }

    /**
     * Sets the value of the artifactDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactDependencies }
     *     
     */
    public void setArtifactDependencies(ArtifactDependencies value) {
        this.artifactDependencies = value;
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
