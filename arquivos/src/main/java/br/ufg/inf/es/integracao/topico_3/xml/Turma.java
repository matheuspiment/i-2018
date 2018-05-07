/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.topico_3.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by aluno on 30/04/18.
 */

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Turma {
    @XmlElementWrapper(name = "alunos")
    @XmlElement(name = "aluno")
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}