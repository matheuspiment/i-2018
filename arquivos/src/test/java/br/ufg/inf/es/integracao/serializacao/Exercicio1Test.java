package br.ufg.inf.es.integracao.serializacao;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * Created by aluno on 09/04/18.
 */
public class Exercicio1Test {

    @Test(expected = NotSerializableException.class)
    public void testIsNotSerializable() throws Exception {
        Pet pet = new Pet("Totó");
        Pet[] pets = { pet };
        Person person = new Person("Matheus", pets);

        int size = TamanhoEmBytes(person);
    }

    private static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
    }


}