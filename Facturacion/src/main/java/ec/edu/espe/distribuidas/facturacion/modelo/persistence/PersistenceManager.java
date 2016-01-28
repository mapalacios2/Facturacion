/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.facturacion.modelo.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author Juanjo
 */
public class PersistenceManager {

    private static Morphia morphia;
    private static MongoClient mongoClient;

    private final Datastore mds;

    static {
        MongoClientOptions mongoOptions = MongoClientOptions.builder().socketTimeout(60000).connectTimeout(60000).build();

        try {
            mongoClient = new MongoClient(new ServerAddress("localhost", 27017), mongoOptions);
        } catch (Exception e) {
            throw new RuntimeException("Error inicializando MongoDB ", e);
        }
        mongoClient.setWriteConcern(WriteConcern.SAFE);
        morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.distribuidas.mongo.modelo", true);
    }
    
    public PersistenceManager(){
        mds = morphia.createDatastore(mongoClient, "base1");
        mds.ensureIndexes();
    }
    
    public Datastore context(){
        return this.mds;
    }
}
