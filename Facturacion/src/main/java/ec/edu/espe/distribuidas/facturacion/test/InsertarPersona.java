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
public class InsertarPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersistenceManager pm = new PersistenceManager();
        Persona p = new Persona();
        p.setCedula("1717965601");
        p.setNombre("Estefania Balseca");
        pm.context().save(p);
        
    }
    
}
