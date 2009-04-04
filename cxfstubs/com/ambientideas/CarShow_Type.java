
package com.ambientideas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarShow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarShow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minimumCompetitors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarShow", propOrder = {
    "city",
    "id",
    "minimumCompetitors",
    "state",
    "venue",
    "version"
})
public class CarShow_Type {

    @XmlElementRef(name = "city", namespace = "http://DefaultNamespace", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "id", namespace = "http://DefaultNamespace", type = JAXBElement.class)
    protected JAXBElement<Long> id;
    protected Integer minimumCompetitors;
    @XmlElementRef(name = "state", namespace = "http://DefaultNamespace", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "venue", namespace = "http://DefaultNamespace", type = JAXBElement.class)
    protected JAXBElement<String> venue;
    @XmlElementRef(name = "version", namespace = "http://DefaultNamespace", type = JAXBElement.class)
    protected JAXBElement<Long> version;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setId(JAXBElement<Long> value) {
        this.id = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the minimumCompetitors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumCompetitors() {
        return minimumCompetitors;
    }

    /**
     * Sets the value of the minimumCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumCompetitors(Integer value) {
        this.minimumCompetitors = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVenue(JAXBElement<String> value) {
        this.venue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVersion(JAXBElement<Long> value) {
        this.version = ((JAXBElement<Long> ) value);
    }

    public String toString() {
        String result = "city: " + getCity().getValue();
        result = result + " id: " + getId().getValue();
        result = result + " minimumCompetitors: " + getMinimumCompetitors();
        result = result + " state: " + getState().getValue();
        result = result + " venue: " + getVenue().getValue();
        result = result + " version: " + getVersion().getValue();
        return result;
    }

}
