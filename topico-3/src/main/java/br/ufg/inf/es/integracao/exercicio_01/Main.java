/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_01;

import br.ufg.inf.es.integracao.exercicio_01.Aluno;
import br.ufg.inf.es.integracao.exercicio_01.Turma;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aluno on 30/04/18.
 */
public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setEmail("joao@gmail.com");
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(a1);
        alunos.add(a1);
        Turma turma = new Turma();
        turma.setAlunos(alunos);

        JAXBContext context = JAXBContext.newInstance(Turma.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        m.marshal(turma, System.out);

//        JAXBContext context = JAXBContext.newInstance(Turma.class);
//        Unmarshaller un = context.createUnmarshaller();
//        Turma turma = (Turma)un.unmarshal(new FileReader("turma.xml"));
//
//        System.out.print(turma.getAlunos().get(0).getNome());
    }
}
