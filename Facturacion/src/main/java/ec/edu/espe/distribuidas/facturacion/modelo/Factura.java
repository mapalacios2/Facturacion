/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.modelo;

import ec.edu.espe.distribuidas.facturacion.modelo.persistence.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author Marco Antonio
 */
@Entity(value="factura")
public class Factura extends BaseEntity{
    
    @Reference
    private DetalleFactura detalle;
    
    @Reference
    private Persona persona;
    
    private String cliente;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    private BigDecimal total;

    public DetalleFactura getDetalle() {
        return detalle;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setDetalle(DetalleFactura detalle) {
        this.detalle = detalle;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "detalle=" + detalle + ", persona=" + persona + ", cliente=" + cliente + ", fechaEmision=" + fechaEmision + ", total=" + total + '}';
    }
    
    
    
    
}
