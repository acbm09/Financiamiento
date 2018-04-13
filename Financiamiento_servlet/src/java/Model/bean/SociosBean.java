/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.xml.ws.WebServiceRef;
import webservice.Sociosws_Service;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author usuario
 */
@Named(value = "sociosBean")
@SessionScoped
public class SociosBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Financiamiento_WS/Sociosws.wsdl")
    private Sociosws_Service service;

    private Integer codigo;
    private String socio;
    private float tasa;
    private int montom;
    private int prestamo;

    public Sociosws_Service getService() {
        return service;
    }

    public void setService(Sociosws_Service service) {
        this.service = service;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public int getMontom() {
        return montom;
    }

    public void setMontom(int montom) {
        this.montom = montom;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }
   

    
    public SociosBean() {
    }
    
    public String solPrestamo(){
        String msj= solicitarPrestamo( prestamo);
        FacesMessage msg= new FacesMessage (FacesMessage.SEVERITY_INFO, msj, "");
        FacesContext.getCurrentInstance().addMessage(null, msg);

        return "index";   
    }

    private String solicitarPrestamo(int prestamo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.Sociosws port = service.getSocioswsPort();
        return port.solicitarPrestamo(prestamo);
    }

    
    
    
    
}
