/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.modelo;

import ec.edu.espe.distribuidas.facturacion.modelo.persistence.BaseEntity;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author Marco Antonio
 */
@Entity(value="persona")
public class Persona extends BaseEntity{
    
    private String nombre;
    private String cedula;

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    @Override
    public String toString() {
        return "Nombre: "+nombre+", Cedula: "+cedula;
    }
    
    
}
