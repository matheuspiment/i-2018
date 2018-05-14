/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

/**
 * Created by aluno on 07/05/18.
 */

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Turma.java
 * Purpose: Representar uma turma de alunos.
 *
 * @author Matheus Ribeiro Pimenta Nunes
 */
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Calcados {
    @XmlElement(name = "calcado")
    private List<Calcado> calcados;

    public List<Calcado> getCalcados() {
        return calcados;
    }

    public void setCalcados(List<Calcado> calcados) {
        this.calcados = calcados;
    }
}