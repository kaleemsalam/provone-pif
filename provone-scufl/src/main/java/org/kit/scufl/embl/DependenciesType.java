//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:01:34 PM CET 
//


package org.kit.scufl.embl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dependenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dependenciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://org.embl.ebi.escience/xscufl/0.1alpha}jarfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://org.embl.ebi.escience/xscufl/0.1alpha}artifact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classloader" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dependenciesType", propOrder = {
    "jarfile",
    "artifact"
})
public class DependenciesType {

    protected List<JarfileType> jarfile;
    protected List<ArtifactType> artifact;
    @XmlAttribute(name = "classloader")
    protected String classloader;

    /**
     * Gets the value of the jarfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jarfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJarfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JarfileType }
     * 
     * 
     */
    public List<JarfileType> getJarfile() {
        if (jarfile == null) {
            jarfile = new ArrayList<JarfileType>();
        }
        return this.jarfile;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtifactType }
     * 
     * 
     */
    public List<ArtifactType> getArtifact() {
        if (artifact == null) {
            artifact = new ArrayList<ArtifactType>();
        }
        return this.artifact;
    }

    /**
     * Gets the value of the classloader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassloader() {
        return classloader;
    }

    /**
     * Sets the value of the classloader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassloader(String value) {
        this.classloader = value;
    }

}
