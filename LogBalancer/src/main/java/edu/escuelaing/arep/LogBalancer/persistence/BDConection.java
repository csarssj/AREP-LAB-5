package edu.escuelaing.arep.LogBalancer.persistence;

import java.util.ArrayList;
import java.util.Date;

import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
 
/**
 * Class tests for MongoDB queries by using collections.
 * Clase de pruebas para las consultas a MongoDB mediante el uso de colecciones.
 * @author ceseg
 */
public class BDConection { 
	
	private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase mongodb;

    /**
     * Conexion a la base de datos
     */
    public BDConection() {
        uri = new MongoClientURI("mongodb://admin:12345@cluster0-shard-00-00.vj1np.mongodb.net:27017,cluster0-shard-00-01.vj1np.mongodb.net:27017,cluster0-shard-00-02.vj1np.mongodb.net:27017/myFirstDatabase?ssl=true&replicaSet=atlas-56f0pa-shard-0&authSource=admin&retryWrites=true&w=majority");
        mongoClient = new MongoClient(uri);
        mongodb = mongoClient.getDatabase("LAB5-AREP");

    }
    /**
     * Agrega un dato a la base de datos
     * @param mensaje
     */
    public void addData(String mensaje) {
    	MongoCollection<Document> collection = mongodb.getCollection("lab5arep");
    	Document object = new Document();
        object.append("mensaje",mensaje);
        object.append("fecha", new Date().toString());
        collection.insertOne(object);
    }
    /**
     * Obtiene los datos de mongo
     * @return data
     */
    public String getData() {
    	MongoCollection<Document> collection = mongodb.getCollection("lab5arep");
        String mensaje = "";
        FindIterable<Document> iterDoc = collection.find();
        for(Document d : iterDoc){
            mensaje += "<tr><td>" + d.get("mensaje").toString() + "</td><td>" + d.get("fecha").toString() + "</td></tr>";
        }
        System.out.println(mensaje);
        return mensaje;
    } 
    
}