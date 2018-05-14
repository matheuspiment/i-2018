/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aluno on 09/04/18.
 */
public class Exercicio2Test {

    @Test
    public void testIsEqual() throws Exception {
        Student student = new Student("Matheus");

        byte[] byteArray = Student.serialize(student);
        Student studentDeserialized = Student.deserialize(byteArray);

        Assert.assertEquals(studentDeserialized.equals(student), true);
    }

    @Test
    public void testIsNotEqual() throws Exception {
        Student student = new Student("Matheus");
        Student otherStudent = new Student("Jose");

        byte[] byteArray = Student.serialize(student);
        Student studentDeserialized = Student.deserialize(byteArray);

        Assert.assertEquals(studentDeserialized.equals(otherStudent), false);
    }
}
