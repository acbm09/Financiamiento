
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SolicitarPrestamo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SolicitarPrestamo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prestamo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitarPrestamo", propOrder = {
    "prestamo"
})
public class SolicitarPrestamo {

    protected int prestamo;

    /**
     * Obtiene el valor de la propiedad prestamo.
     * 
     */
    public int getPrestamo() {
        return prestamo;
    }

    /**
     * Define el valor de la propiedad prestamo.
     * 
     */
    public void setPrestamo(int value) {
        this.prestamo = value;
    }

}
