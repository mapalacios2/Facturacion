/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.test;

import ec.edu.espe.distribuidas.facturacion.modelo.Persona;
import ec.edu.espe.distribuidas.facturacion.modelo.persistence.PersistenceManager;
import java.util.List;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author david
 */
public class BuscarCedula {
    public static void main(String[] args) {
        
        String cedula = "1717965691";
        
        PersistenceManager p = new PersistenceManager();
        Query<Persona> query = p.context().createQuery(Persona.class);
        List<Persona> personas = query.filter("cedula =", cedula).asList();
        
        System.out.println("Datos: " + personas);
    }
}
