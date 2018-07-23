//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.23 at 12:15:41 PM PDT 
//


package edu.caltech.ipac.util.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Part of WhereWhen
 * 
 * <p>Java class for ObservatoryLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservatoryLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AstroCoordSystem" type="{http://www.ivoa.net/xml/VOEvent/v2.0}AstroCoordSystem" minOccurs="0"/>
 *         &lt;element name="AstroCoords" type="{http://www.ivoa.net/xml/VOEvent/v2.0}AstroCoords" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservatoryLocation", propOrder = {

})
public class ObservatoryLocation {

    @XmlElement(name = "AstroCoordSystem")
    protected AstroCoordSystem astroCoordSystem;
    @XmlElement(name = "AstroCoords")
    protected AstroCoords astroCoords;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the astroCoordSystem property.
     * 
     * @return
     *     possible object is
     *     {@link AstroCoordSystem }
     *     
     */
    public AstroCoordSystem getAstroCoordSystem() {
        return astroCoordSystem;
    }

    /**
     * Sets the value of the astroCoordSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstroCoordSystem }
     *     
     */
    public void setAstroCoordSystem(AstroCoordSystem value) {
        this.astroCoordSystem = value;
    }

    /**
     * Gets the value of the astroCoords property.
     * 
     * @return
     *     possible object is
     *     {@link AstroCoords }
     *     
     */
    public AstroCoords getAstroCoords() {
        return astroCoords;
    }

    /**
     * Sets the value of the astroCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstroCoords }
     *     
     */
    public void setAstroCoords(AstroCoords value) {
        this.astroCoords = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
