/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_01;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Programa que lê um arquivo CSV contendo uma lista de alunos e gera o arquivo XML correspondente.
 */
public class Exercicio1 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Filepath do arquivo CSV a ser utilizado.
     */
    public static void main(String[] args) throws JAXBException {

        String csvFile = args[0];
        BufferedReader br = null;
        String csvDivisor = ";";

        Turma turma = new Turma();

        try {

            br = new BufferedReader(new FileReader(csvFile));
            ArrayList<Aluno> alunos = (ArrayList<Aluno>) getAlunos(br, csvDivisor);

            turma.setAlunos(alunos);

            JAXBContext context = JAXBContext.newInstance(Turma.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(turma, new File("alunos.xml"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Retorna uma lista com os alunos de um BufferedReader (CSV).
     *
     * @param bufferedReader Uma instânica BufferedReader.
     * @param csvDivisor Caractere utilizado como divisor.
     * @return List contendo os alunos do BufferedReader.
     */
    public static List<Aluno> getAlunos(BufferedReader bufferedReader, String csvDivisor) throws IOException {
        List<Aluno> alunos = new ArrayList<>();
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            String[] line = linha.split(csvDivisor);

            Aluno aluno = new Aluno();
            aluno.setNome(line[line.length - 2]);
            aluno.setEmail(line[line.length - 1]);

            alunos.add(aluno);
        }

        return alunos;
    }

}
