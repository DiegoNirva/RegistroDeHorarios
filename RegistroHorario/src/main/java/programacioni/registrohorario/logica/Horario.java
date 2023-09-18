package programacioni.registrohorario.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int registro;

    @Basic
    private String dia;
    private String horaEntrada;
    private String horaSalida;

    @OneToOne
    //@JoinColumn(name = "dni")
    private Usuario usuario;

    public Horario() {
    }

    public Horario(int registro, String dia, String horaEntrada, String horaSalida, Usuario usuario) {
        this.registro = registro;
        this.dia = dia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.usuario = usuario;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
