package programacioni.registrohorario.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    private String dni;
    
    @Basic
    private String nombreUsuario;
    private String Contrasenia;
    private String rool;

    public Usuario() {
    }

    public Usuario(String dni, String nombreUsuario, String Contrasenia, String rool) {
        this.dni = dni;
        this.nombreUsuario = nombreUsuario;
        this.Contrasenia = Contrasenia;
        this.rool = rool;
        
    }

    public String getRool() {
        return rool;
    }

    public void setRool(String rool) {
        this.rool = rool;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

}
