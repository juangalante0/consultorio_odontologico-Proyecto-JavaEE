
package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona {
    
    //private int idResponsable;
    private String tipoResp;
    
    public Responsable(){}

    public Responsable(String tipoResp, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.tipoResp = tipoResp;
    }

    

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }
    
    
    
}
