
package com.ambientideas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ambientideas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CarShow_TypeState_QNAME = new QName("http://DefaultNamespace", "state");
    private final static QName _CarShow_TypeVersion_QNAME = new QName("http://DefaultNamespace", "version");
    private final static QName _CarShow_TypeCity_QNAME = new QName("http://DefaultNamespace", "city");
    private final static QName _CarShow_TypeVenue_QNAME = new QName("http://DefaultNamespace", "venue");
    private final static QName _CarShow_TypeId_QNAME = new QName("http://DefaultNamespace", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ambientideas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCarShows }
     * 
     */
    public GetAllCarShows createGetAllCarShows() {
        return new GetAllCarShows();
    }

    /**
     * Create an instance of {@link ArrayOfCarShow }
     * 
     */
    public ArrayOfCarShow createArrayOfCarShow() {
        return new ArrayOfCarShow();
    }

    /**
     * Create an instance of {@link GetCarShow }
     * 
     */
    public GetCarShow createGetCarShow() {
        return new GetCarShow();
    }

    /**
     * Create an instance of {@link GetAllCarShowsAsArray }
     * 
     */
    public GetAllCarShowsAsArray createGetAllCarShowsAsArray() {
        return new GetAllCarShowsAsArray();
    }

    /**
     * Create an instance of {@link IsValidCarShowResponse }
     * 
     */
    public IsValidCarShowResponse createIsValidCarShowResponse() {
        return new IsValidCarShowResponse();
    }

    /**
     * Create an instance of {@link CarShow_Type }
     * 
     */
    public CarShow_Type createCarShow_Type() {
        return new CarShow_Type();
    }

    /**
     * Create an instance of {@link GetAllCarShowsAsArrayResponse }
     * 
     */
    public GetAllCarShowsAsArrayResponse createGetAllCarShowsAsArrayResponse() {
        return new GetAllCarShowsAsArrayResponse();
    }

    /**
     * Create an instance of {@link IsValidCarShow }
     * 
     */
    public IsValidCarShow createIsValidCarShow() {
        return new IsValidCarShow();
    }

    /**
     * Create an instance of {@link GetCarShowResponse }
     * 
     */
    public GetCarShowResponse createGetCarShowResponse() {
        return new GetCarShowResponse();
    }

    /**
     * Create an instance of {@link GetAllCarShowsResponse }
     * 
     */
    public GetAllCarShowsResponse createGetAllCarShowsResponse() {
        return new GetAllCarShowsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "state", scope = CarShow_Type.class)
    public JAXBElement<String> createCarShow_TypeState(String value) {
        return new JAXBElement<String>(_CarShow_TypeState_QNAME, String.class, CarShow_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "version", scope = CarShow_Type.class)
    public JAXBElement<Long> createCarShow_TypeVersion(Long value) {
        return new JAXBElement<Long>(_CarShow_TypeVersion_QNAME, Long.class, CarShow_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "city", scope = CarShow_Type.class)
    public JAXBElement<String> createCarShow_TypeCity(String value) {
        return new JAXBElement<String>(_CarShow_TypeCity_QNAME, String.class, CarShow_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "venue", scope = CarShow_Type.class)
    public JAXBElement<String> createCarShow_TypeVenue(String value) {
        return new JAXBElement<String>(_CarShow_TypeVenue_QNAME, String.class, CarShow_Type.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "id", scope = CarShow_Type.class)
    public JAXBElement<Long> createCarShow_TypeId(Long value) {
        return new JAXBElement<Long>(_CarShow_TypeId_QNAME, Long.class, CarShow_Type.class, value);
    }

}
