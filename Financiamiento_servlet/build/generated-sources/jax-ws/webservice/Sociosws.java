
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Sociosws", targetNamespace = "http://Webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Sociosws {


    /**
     * 
     * @param prestamo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SolicitarPrestamo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SolicitarPrestamo", targetNamespace = "http://Webservice/", className = "webservice.SolicitarPrestamo")
    @ResponseWrapper(localName = "SolicitarPrestamoResponse", targetNamespace = "http://Webservice/", className = "webservice.SolicitarPrestamoResponse")
    @Action(input = "http://Webservice/Sociosws/SolicitarPrestamoRequest", output = "http://Webservice/Sociosws/SolicitarPrestamoResponse")
    public String solicitarPrestamo(
        @WebParam(name = "prestamo", targetNamespace = "")
        int prestamo);

}