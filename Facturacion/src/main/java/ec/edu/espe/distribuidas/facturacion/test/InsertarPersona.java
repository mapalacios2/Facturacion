/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.test;

import ec.edu.espe.distribuidas.facturacion.modelo.Producto;
import ec.edu.espe.distribuidas.facturacion.modelo.persistence.PersistenceManager;

/**
 *
 * @author Juanjo
 */
public class InsertarPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersistenceManager pm = new PersistenceManager();
        Producto p = new Producto();
        p.setCodigoProducto("001");
        p.setNombre("Jagger");
        p.setPrecioUnitario(40f); 
        pm.context().save(p);
    }
    
}
