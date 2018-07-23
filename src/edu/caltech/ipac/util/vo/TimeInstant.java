//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.23 at 12:15:41 PM PDT 
//


package edu.caltech.ipac.util.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 *  Part of WhereWhen
 * 
 * <p>Java class for TimeInstant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInstant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ISOTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeOffset" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="TimeScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstant", propOrder = {
    "isoTimeOrTimeOffsetOrTimeScale"
})
public class TimeInstant {

    @XmlElementRefs({
        @XmlElementRef(name = "TimeScale", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ISOTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimeOffset", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> isoTimeOrTimeOffsetOrTimeScale;

    /**
     * Gets the value of the isoTimeOrTimeOffsetOrTimeScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isoTimeOrTimeOffsetOrTimeScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISOTimeOrTimeOffsetOrTimeScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getISOTimeOrTimeOffsetOrTimeScale() {
        if (isoTimeOrTimeOffsetOrTimeScale == null) {
            isoTimeOrTimeOffsetOrTimeScale = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.isoTimeOrTimeOffsetOrTimeScale;
    }

}
