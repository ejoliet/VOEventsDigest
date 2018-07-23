//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.23 at 12:15:41 PM PDT 
//


package edu.caltech.ipac.util.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Who: Curation Metadata 
 * 
 * <p>Java class for Who complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Who">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AuthorIVORN" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.ivoa.net/xml/VOEvent/v2.0}Reference" minOccurs="0"/>
 *         &lt;element name="Author" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="logoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="contributor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Who", propOrder = {

})
public class Who {

    @XmlElement(name = "AuthorIVORN")
    @XmlSchemaType(name = "anyURI")
    protected String authorIVORN;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Reference")
    protected Reference reference;
    @XmlElement(name = "Author")
    protected Who.Author author;

    /**
     * Gets the value of the authorIVORN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorIVORN() {
        return authorIVORN;
    }

    /**
     * Sets the value of the authorIVORN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorIVORN(String value) {
        this.authorIVORN = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link Who.Author }
     *     
     */
    public Who.Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link Who.Author }
     *     
     */
    public void setAuthor(Who.Author value) {
        this.author = value;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="logoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="contributor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titleOrShortNameOrLogoURL"
    })
    public static class Author {

        @XmlElementRefs({
            @XmlElementRef(name = "logoURL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "contributor", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "contactName", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "contactPhone", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "shortName", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "contactEmail", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> titleOrShortNameOrLogoURL;

        /**
         * Gets the value of the titleOrShortNameOrLogoURL property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titleOrShortNameOrLogoURL property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTitleOrShortNameOrLogoURL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getTitleOrShortNameOrLogoURL() {
            if (titleOrShortNameOrLogoURL == null) {
                titleOrShortNameOrLogoURL = new ArrayList<JAXBElement<String>>();
            }
            return this.titleOrShortNameOrLogoURL;
        }

    }

}