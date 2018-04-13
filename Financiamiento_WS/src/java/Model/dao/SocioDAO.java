/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.pojos.Socios;
import org.hibernate.SessionFactory;
import org.hibernate.Session; 

/**
 *
 * @author usuario
 */
public class SocioDAO {
    public String solicitarPrestamo (int p){
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        Socios s= null;
        int j=0;
        double vf=0;
        
        for (int i=1; i<4; i++){
            
            s= (Socios)session.get(Socios.class, i);
            
            if(i>1 && j>0){
                Socios s2= (Socios)session.get(Socios.class, j);
                if(p<s.getMontom() && s.getTasa()<s2.getTasa()){
                    j=i;
                }
            }
            else{
                if(p<s.getMontom()){
                    j=i;
                }
            }
        }
        
        if(j!=0){
            s= (Socios)session.get(Socios.class, j);
            vf=p*(1+36*(s.getTasa()/100));
            double mes= vf/36;
            session.close();
        
            return "Monto del prestamo: $"+ p
                    +"\n Socio que realiza el prestamo: "+s.getSocio()
                    +"\n Cuota mensual: $"+String.format("%.2f", mes)
                    +"\n Pago total del credito: $"+String.format("%.2f", vf)
                    +"\n Tasa de interes mensual: "+s.getTasa()+"%";
                    
        }
        else{
            
            session.close();
            return "No hay socio disponible para este monto.";
        }

    }
    
}
