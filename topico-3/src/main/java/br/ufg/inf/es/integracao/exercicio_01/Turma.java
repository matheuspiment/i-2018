/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_01;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Turma.java
 * Purpose: Representar uma turma de alunos.
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