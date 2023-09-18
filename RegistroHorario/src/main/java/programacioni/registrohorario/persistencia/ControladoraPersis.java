
package programacioni.registrohorario.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import programacioni.registrohorario.logica.Horario;
import programacioni.registrohorario.logica.Usuario;
import programacioni.registrohorario.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersis {

    UsuarioJpaController usuJpa = new UsuarioJpaController();
    HorarioJpaController horaJpa = new HorarioJpaController();

    public List<Usuario> listaUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void guardarHorarioIn(Horario registro) {
        
        horaJpa.create(registro);
    }

    public Usuario buscarUsuario(String dni) {
        return usuJpa.findUsuario(dni);
    }

    public List<Horario> traerHorario() {
        return horaJpa.findHorarioEntities();
    }

    public List<Horario> buscarHorario() {
        return horaJpa.findHorarioEntities();
    }

    public void editarSalida(Horario hora) {
        try {
            horaJpa.edit(hora);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Horario buscarHorarioId(int idRegistro) {
        return horaJpa.findHorario(idRegistro);
    }

    public List<Usuario> traerUsuario() {
        return usuJpa.findUsuarioEntities();
    }

    public void guardarUsuario(Usuario usuario) {
        try {
            usuJpa.create(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarUsuario(Usuario usuario) {
        try {
            usuJpa.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarUsuario(String dni) {
        try {
            usuJpa.destroy(dni);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
    
}
