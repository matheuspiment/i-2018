/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.topico_2.serializacao;

import java.io.Serializable;

/**
 * Created by aluno on 09/04/18.
 */
public class Person implements Serializable {
    private String name;
    private Pet[] pets;

    public Person(String name, Pet[] pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
