
package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Sociosws", targetNamespace = "http://Webservice/", wsdlLocation = "http://localhost:8080/Financiamiento_WS/Sociosws?wsdl")
public class Sociosws_Service
    extends Service
{

    private final static URL SOCIOSWS_WSDL_LOCATION;
    private final static WebServiceException SOCIOSWS_EXCEPTION;
    private final static QName SOCIOSWS_QNAME = new QName("http://Webservice/", "Sociosws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Financiamiento_WS/Sociosws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOCIOSWS_WSDL_LOCATION = url;
        SOCIOSWS_EXCEPTION = e;
    }

    public Sociosws_Service() {
        super(__getWsdlLocation(), SOCIOSWS_QNAME);
    }

    public Sociosws_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOCIOSWS_QNAME, features);
    }

    public Sociosws_Service(URL wsdlLocation) {
        super(wsdlLocation, SOCIOSWS_QNAME);
    }

    public Sociosws_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOCIOSWS_QNAME, features);
    }

    public Sociosws_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Sociosws_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Sociosws
     */
    @WebEndpoint(name = "SocioswsPort")
    public Sociosws getSocioswsPort() {
        return super.getPort(new QName("http://Webservice/", "SocioswsPort"), Sociosws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sociosws
     */
    @WebEndpoint(name = "SocioswsPort")
    public Sociosws getSocioswsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Webservice/", "SocioswsPort"), Sociosws.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOCIOSWS_EXCEPTION!= null) {
            throw SOCIOSWS_EXCEPTION;
        }
        return SOCIOSWS_WSDL_LOCATION;
    }

}
