
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona {
    
    //private int idOdontologo;
    private String especialidad;
    @OneToMany(mappedBy = "odonto")
    private List<Turno> listaTurnos;
    @OneToOne
    private Usuario unHunUsuario;
    @OneToOne
    private Horario orario;
    
    public Odontologo(){}

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario unHunUsuario, Horario orario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unHunUsuario = unHunUsuario;
        this.orario = orario;
    }



    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUnHunUsuario() {
        return unHunUsuario;
    }

    public void setUnHunUsuario(Usuario unHunUsuario) {
        this.unHunUsuario = unHunUsuario;
    }

    public Horario getOrario() {
        return orario;
    }

    public void setOrario(Horario orario) {
        this.orario = orario;
    }
    
    
}
