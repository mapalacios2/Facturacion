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
@Entity(value="detalle_factura")
public class DetalleFactura extends BaseEntity {
    
    @Reference
    private Producto producto;
    
    private String nombreProducto;
    private BigDecimal precioProducto;
    private BigDecimal totalParcial;

    public Producto getProducto() {
        return producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public BigDecimal getPrecioProducto() {
        return precioProducto;
    }

    public BigDecimal getTotalParcial() {
        return totalParcial;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(BigDecimal precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setTotalParcial(BigDecimal totalParcial) {
        this.totalParcial = totalParcial;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "producto=" + producto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", totalParcial=" + totalParcial + '}';
    }
    
    
}
