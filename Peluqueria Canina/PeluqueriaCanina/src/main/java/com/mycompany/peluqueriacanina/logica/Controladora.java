
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controladora = new ControladoraPersistencia();

    public void guarda(String nombreMasco, String raza, String color, String alergico, String atenEsp, String nombreDuenio, String celDuenio, String observaciones) {
        
        //primero crear el id foraneo
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCel(celDuenio);
     
        
        //mascota
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
       
        //guardamos duenio y mascota
        controladora.guardar(duenio, masco);


    }
    
      public List<Mascota> trearMascotas() {
    
        return controladora.trearMascotas();
    }
    
    public Mascota traerMascota(int num_cliente) {
        return controladora.traerMascota(num_cliente);
    }

    public void borrarMascota(int num_cliente) {
        controladora.borrarMascota(num_cliente);
    }



    public void editar(Mascota masco, String nombreMasco, String raza, String color, String alergico, String atenEsp, String nombreDuenio, String celDuenio, String observaciones) {

        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
       
        //guardamos la edicion
        controladora.editar(masco);
        
        //editamos los datos del dueñio
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setNombre(nombreDuenio);
        dueno.setCel(celDuenio);
        
        //guardamos datos nuenio
        this.editarDuenio(dueno);
    }
            
    private Duenio buscarDuenio(int id_duenio){
        return controladora.traerDuenio(id_duenio);
    }
    
    private void editarDuenio(Duenio dueno){
        controladora.editarDuenio(dueno);
    }

  
    
}
