package br.ufg.inf.es.integracao.xml;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by aluno on 30/04/18.
 */

@XmlRootElement()
public class Turma {
    private ArrayList<Aluno> alunos;

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
