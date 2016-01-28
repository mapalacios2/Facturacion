/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.modelo;

import ec.edu.espe.distribuidas.facturacion.modelo.persistence.BaseEntity;
import java.math.BigDecimal;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author Marco Antonio
 */
@Entity(value="producto")
public class Producto extends BaseEntity{
    
     private String codigoProducto;
     private String nombre;
     private Float precioUnitario;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + '}';
    }
     
     
    
    
}
