/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.services;

import br.ufg.inf.es.integracao.entidades.Endereco;
import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Classe principal do programa.
 */
public class Main {

    public static void main(String[] args) {

        Conection conection = null;
        try {
            conection = new Conection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        persistir(conection.getBaseDados());
    }

    public static void persistir(MongoDatabase baseDados) {

        Endereco endereco = new Endereco();
        endereco.setBairro("Itapoã");
        endereco.setCaixaPostal("000");
        endereco.setCep("74940-510");
        endereco.setCodigoMunicipio(222);

        MongoCollection<Document> individuos = baseDados.getCollection("individuos");

        MongoCursor<Document> cursor = individuos.find().iterator();

        Gson gson = new Gson();

        String json = gson.toJson(endereco);

        Document individuo = new Document("individuo", json);
        individuos.insertOne(individuo);

        // Update
        Document updDocument = new Document("name", "Matheus");
        individuos.updateOne(updDocument, new Document("$set", new Document("idade", 21)));

        try {
            while (cursor.hasNext()){
                Document doc = cursor.next();
                System.out.println(doc.get("name"));
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
