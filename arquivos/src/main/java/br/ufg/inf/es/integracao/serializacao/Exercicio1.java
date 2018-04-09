/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.serializacao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Programa que provoca a geração da exceção NotSerializableException quando se tenta serializar um objeto.
 */
public class Exercicio1 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados.
     */
    public static void main(String[] args) {
        Pet pet = new Pet("Totó");
        Pet[] pets = { pet };
        Person person = new Person("Matheus", pets);

        try {
            int size = TamanhoEmBytes(person);
            System.out.println(size);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
    }

}
