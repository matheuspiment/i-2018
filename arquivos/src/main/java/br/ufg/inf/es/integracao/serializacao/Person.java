package br.ufg.inf.es.integracao.serializacao;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
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
