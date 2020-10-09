/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
//import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;

/**
 *
 * @author equipo
 */


public class Road_To_Sun {
      //com.mongodb.client.MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
 MongoClient mongoClient;
    MongoClientURI uri = new
    MongoClientURI("mongodb://userLab3:passworduserLab3@93.188.167.110:27017/?authSource=lab3");
    MongoDatabase db;
   
//comentario prueba    
     public String consultarCientes(){
   //  return "{\"clave\":\"Hola mundo\"}";  //construccion Json
    mongoClient = new MongoClient(uri);
    db = mongoClient.getDatabase("lab3");
   MongoCollection<Document> collection = db.getCollection("usuarios");

   return  collection.find().first().toJson();
 
    }
     
     
  
    
}
