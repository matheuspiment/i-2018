package br.ufg.inf.es.integracao.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by aluno on 30/04/18.
 */
public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
//        Aluno a1 = new Aluno("João", "joao@gmail.com");
//        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
//        alunos.add(a1);
//        Turma turma = new Turma();
//        turma.setAlunos(alunos);
//
//        JAXBContext context = JAXBContext.newInstance(Turma.class);
//        Marshaller m = context.createMarshaller();
//        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//        m.marshal(turma, System.out);

        JAXBContext context = JAXBContext.newInstance(Turma.class);
        Unmarshaller un = context.createUnmarshaller();
        Turma turma = (Turma)un.unmarshal(new FileReader("turma.xml"));

        System.out.print(turma.getAlunos().get(0).getNome());
    }
}
