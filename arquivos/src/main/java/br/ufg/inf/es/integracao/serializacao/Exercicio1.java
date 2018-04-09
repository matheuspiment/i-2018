package br.ufg.inf.es.integracao.serializacao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by aluno on 09/04/18.
 */
public class Exercicio1 {

    private static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
    }

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

}
