/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.test;

import ec.edu.espe.distribuidas.facturacion.modelo.Persona;
import ec.edu.espe.distribuidas.facturacion.modelo.persistence.PersistenceManager;

/**
 *
 * @author Juanjo
 */
public class InsertarProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersistenceManager pm = new PersistenceManager();
        Persona p = new Persona();
        p.setCedula("1805485632");
        p.setNombre("Giovana Defaz");
        pm.context().save(p);
        
    }
    
}
