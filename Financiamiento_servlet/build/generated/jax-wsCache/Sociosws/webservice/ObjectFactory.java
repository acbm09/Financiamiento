
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _SolicitarPrestamo_QNAME = new QName("http://Webservice/", "SolicitarPrestamo");
    private final static QName _SolicitarPrestamoResponse_QNAME = new QName("http://Webservice/", "SolicitarPrestamoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolicitarPrestamo }
     * 
     */
    public SolicitarPrestamo createSolicitarPrestamo() {
        return new SolicitarPrestamo();
    }

    /**
     * Create an instance of {@link SolicitarPrestamoResponse }
     * 
     */
    public SolicitarPrestamoResponse createSolicitarPrestamoResponse() {
        return new SolicitarPrestamoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPrestamo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Webservice/", name = "SolicitarPrestamo")
    public JAXBElement<SolicitarPrestamo> createSolicitarPrestamo(SolicitarPrestamo value) {
        return new JAXBElement<SolicitarPrestamo>(_SolicitarPrestamo_QNAME, SolicitarPrestamo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPrestamoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Webservice/", name = "SolicitarPrestamoResponse")
    public JAXBElement<SolicitarPrestamoResponse> createSolicitarPrestamoResponse(SolicitarPrestamoResponse value) {
        return new JAXBElement<SolicitarPrestamoResponse>(_SolicitarPrestamoResponse_QNAME, SolicitarPrestamoResponse.class, null, value);
    }

}
