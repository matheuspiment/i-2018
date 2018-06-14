package br.ufg.inf.es.integracao;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Exercicio3Test {

    @Test
    public void getLines() throws IOException {
        String myString = "Olá\nMundo";
        InputStream is = new ByteArrayInputStream(myString.getBytes());
        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader bufferedReader = new BufferedReader(isr);
        ArrayList<String> lines = (ArrayList<String>) Exercicio3.getLines(bufferedReader);
        Assert.assertEquals("Olá", lines.get(0));
        Assert.assertEquals("Mundo", lines.get(1));
    }
}