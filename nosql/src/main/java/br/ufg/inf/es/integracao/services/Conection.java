/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.services;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

/**
 * Cria conexão com o banco de dados.
 */
public class Conection {

    private MongoDatabase baseDados;

    public Conection() throws Exception {
        if (this.baseDados == null) {
            MongoClientURI aux = new MongoClientURI("mongodb://root:qwe123@ds255320.mlab.com:55320/nosql");
            MongoClient client = new MongoClient(aux);
            this.baseDados = client.getDatabase(aux.getDatabase());
        } else {
            throw new Exception("Erro ao estabelecer conexão.");
        }
    }

    public MongoDatabase getBaseDados() {
        return baseDados;
    }
}
