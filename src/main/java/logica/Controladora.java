
package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPeris = new ControladoraPersistencia();
    
    public Controladora(){}
    
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rol){
    
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        controlPeris.crearUsuario(usu);
    }
    
    public List<Usuario> getUsuarios() {
    
        return controlPeris.getUsuarios();
    }

    public void borrarUsuario(int id) {
        controlPeris.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPeris.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPeris.editarUsurio(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        
        boolean ingreso = false;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPeris.getUsuarios();

        for (Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia))
                    ingreso = true;
            }
        }
        return ingreso;
    }
    
    
    
    
    
}
