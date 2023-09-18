
package programacioni.registrohorario.logica;

import java.util.List;
import programacioni.registrohorario.persistencia.ControladoraPersis;

public class Controladora {

    ControladoraPersis controPersi = new ControladoraPersis();
    
    public List<Usuario> listaUsuarios() {
      return controPersi.listaUsuarios();
    }

    public void guardarHorarioIn(String dia, String horaEntrada, String horaSalida, Usuario usuario) {
        
        //creamos el objeto horario
        Horario registro = new Horario();
        registro.setDia(dia);
        registro.setHoraEntrada(horaEntrada);
        registro.setUsuario(usuario);
        
        controPersi.guardarHorarioIn(registro);
        
        
        
       //controPersi.guardarHorarioIn(dia, dni, horaEntrada);
    }

    public Usuario buscarUsuario(String dni) {
        return controPersi.buscarUsuario(dni);
    }

    public List<Horario> traerHorario() {
     return controPersi.traerHorario();
    }

    public List<Horario> buscarHorario() {
       return controPersi.buscarHorario();
    }

    public void editarSalida(String horaSalida, Horario hora) {
        hora.setHoraSalida(horaSalida);
        
        //guardamos registro salida
        controPersi.editarSalida(hora);
    }

    public Horario buscarHorarioId(int idRegistro) {
        return controPersi.buscarHorarioId(idRegistro);
    }

    public List<Usuario> traerUsuario() {
        return  controPersi.traerUsuario();
    }

    public void guardarUsuario(String dni, String contrasenia, String nombreUsuario, String roll) {
        
        //creamos el objeto Usuario
        Usuario usuario = new Usuario();
        usuario.setDni(dni);
        usuario.setContrasenia(contrasenia);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setRool(roll);
        
        controPersi.guardarUsuario(usuario);
    }

    public void editarUsuario(Usuario usuario, String dni, String contrasenia, String nombreUsuario, String roll) {
        //seteamos valores
        usuario.setDni(dni);
        usuario.setContrasenia(contrasenia);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setRool(roll);
        
        controPersi.editarUsuario(usuario);
    }

    public void eliminarUsuario(String dni) {
        controPersi.eliminarUsuario(dni);
    }



}
