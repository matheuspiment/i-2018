package br.ufg.inf.es.integracao;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class Exercicio2Test {

    @Test
    public void isImage() throws IOException {
        Assert.assertEquals(true, Exercicio2.isImage("ffd8", "ffd9"));
    }

    @Test
    public void isNotImage() throws IOException {
        Assert.assertEquals(false, Exercicio2.isImage("ffd9", "ffd8"));
    }
}