package br.ufg.inf.es.integracao.exercicio_01;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Exercicio1Test {

    @Test
    public void getAlunos() throws IOException {
        String myString = "Matheus;matheus@gmail.com\nJosé;jose@gmail.com";
        InputStream is = new ByteArrayInputStream(myString.getBytes());
        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader bufferedReader = new BufferedReader(isr);
        ArrayList<Aluno> alunos = (ArrayList<Aluno>) Exercicio1.getAlunos(bufferedReader, ";");

        Assert.assertEquals("Matheus", alunos.get(0).getNome());
        Assert.assertEquals("matheus@gmail.com", alunos.get(0).getEmail());

        Assert.assertEquals("José", alunos.get(1).getNome());
        Assert.assertEquals("jose@gmail.com", alunos.get(1).getEmail());
    }
}