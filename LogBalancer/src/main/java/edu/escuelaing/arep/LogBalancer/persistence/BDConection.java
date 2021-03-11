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
    private MongoCollection collection;

    /**
     * Conexion a la base de datos
     */
    public BDConection() {
        uri = new MongoClientURI("mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false");
        		//mongodb+srv://admin:<password>@cluster0.4ocja.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
        		//mongodb://admin:admin123@database-arep:27017/?serverSelectionTimeoutMS=5000&connectTimeoutMS=10000&authSource=database&authMechanism=SCRAM-SHA-256&3t.uriVersion=3&3t.connection.name=database
        mongoClient = new MongoClient(uri);
        mongodb = mongoClient.getDatabase("LAB5-AREP");
        collection = mongodb.getCollection("lab5arep");

    }
    public void addData(String mensaje) {
    	Document object = new Document();
        object.append("mensaje",mensaje);
        object.append("fecha", new Date().toString());
        collection.insertOne(object);
    }
    public String getData() {
        String mensaje = "";
        FindIterable<Document> iterDoc = collection.find();
        ArrayList<String> doc = new ArrayList<String>();
        for(Document d : iterDoc){
            mensaje += "{mensaje: "+d.get("mensaje").toString() +", fecha: " +d.get("fecha").toString()+"}";
            doc.add(mensaje);
        }
        return mensaje;
    } 
    
}