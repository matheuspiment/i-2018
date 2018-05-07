/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.topico_3.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by aluno on 30/04/18.
 */
public class Exercicio1 {
    public static void main(String[] args) throws JAXBException {

        String csvFile = "alunos.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";

        Turma turma = new Turma();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((linha = br.readLine()) != null) {

                String[] line = linha.split(csvDivisor);

                Aluno aluno = new Aluno();
                aluno.setNome(line[line.length - 2]);
                aluno.setEmail(line[line.length - 1]);

                alunos.add(aluno);

            }

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

}
