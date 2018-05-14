/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

/**
 * Programa para exercitar a serialização e desserialização de instâncias da classe Student.
 */
public class Exercicio2 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados.
     */
    public static void main(String[] args) {
        Student student = new Student("Matheus");
        byte[] byteArray;

        try {
            byteArray = Student.serialize(student);
            Student studentDeserialized = Student.deserialize(byteArray);
            System.out.println(studentDeserialized.getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
