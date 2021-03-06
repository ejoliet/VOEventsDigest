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
 * <p>Java class for AstroCoords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AstroCoords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Time" type="{http://www.ivoa.net/xml/VOEvent/v2.0}Time" minOccurs="0"/>
 *         &lt;element name="Position2D" type="{http://www.ivoa.net/xml/VOEvent/v2.0}Position2D" minOccurs="0"/>
 *         &lt;element name="Position3D" type="{http://www.ivoa.net/xml/VOEvent/v2.0}Position3D" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="coord_system_id" type="{http://www.ivoa.net/xml/VOEvent/v2.0}idValues" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AstroCoords", propOrder = {

})
public class AstroCoords {

    @XmlElement(name = "Time")
    protected Time time;
    @XmlElement(name = "Position2D")
    protected Position2D position2D;
    @XmlElement(name = "Position3D")
    protected Position3D position3D;
    @XmlAttribute(name = "coord_system_id")
    protected IdValues coordSystemId;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the position2D property.
     * 
     * @return
     *     possible object is
     *     {@link Position2D }
     *     
     */
    public Position2D getPosition2D() {
        return position2D;
    }

    /**
     * Sets the value of the position2D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position2D }
     *     
     */
    public void setPosition2D(Position2D value) {
        this.position2D = value;
    }

    /**
     * Gets the value of the position3D property.
     * 
     * @return
     *     possible object is
     *     {@link Position3D }
     *     
     */
    public Position3D getPosition3D() {
        return position3D;
    }

    /**
     * Sets the value of the position3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position3D }
     *     
     */
    public void setPosition3D(Position3D value) {
        this.position3D = value;
    }

    /**
     * Gets the value of the coordSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link IdValues }
     *     
     */
    public IdValues getCoordSystemId() {
        return coordSystemId;
    }

    /**
     * Sets the value of the coordSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdValues }
     *     
     */
    public void setCoordSystemId(IdValues value) {
        this.coordSystemId = value;
    }

}
