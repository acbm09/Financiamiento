/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Model.dao.SocioDAO;

/**
 *
 * @author usuario
 */
@WebService(serviceName = "Sociosws")
public class Sociosws {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SolicitarPrestamo")
    public String SolicitarPrestamo(@WebParam(name = "prestamo") int prestamo) {
        
        SocioDAO sdao = new SocioDAO();
        
        
        return sdao.solicitarPrestamo(prestamo);
    }
}
