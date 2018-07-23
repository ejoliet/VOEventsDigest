//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.23 at 12:15:41 PM PDT 
//


package edu.caltech.ipac.util.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Citations: Follow-up Observations. This section is a sequence of EventIVORN
 *         elements, each of which has the IVORN of a cited event. 
 * 
 * <p>Java class for Citations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventIVORN" type="{http://www.ivoa.net/xml/VOEvent/v2.0}EventIVORN" maxOccurs="unbounded"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citations", propOrder = {
    "eventIVORN",
    "description"
})
public class Citations {

    @XmlElement(name = "EventIVORN", required = true)
    protected List<EventIVORN> eventIVORN;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the eventIVORN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventIVORN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventIVORN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventIVORN }
     * 
     * 
     */
    public List<EventIVORN> getEventIVORN() {
        if (eventIVORN == null) {
            eventIVORN = new ArrayList<EventIVORN>();
        }
        return this.eventIVORN;
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

}
