package br.ufg.inf.es.integracao;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Exercicio1Test {

    @Test
    public void readIntFromDataInput() throws IOException {
        DataInputStream dataInput = setupTest();
        Assert.assertEquals(4, Exercicio1.readIntFromDataInput(dataInput));
    }

    public DataInputStream setupTest() {
        byte[] bytes = ByteBuffer.allocate(4).putInt(4).array();
        ByteArrayInputStream is = new ByteArrayInputStream(bytes);

        return new DataInputStream(is);
    }
}