/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

/**
 * Created by aluno on 07/05/18.
 */

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Turma.java
 * Purpose: Representar uma turma de alunos.
 *
 * @author Matheus Ribeiro Pimenta Nunes
 */
@JacksonXmlRootElement(localName = "calcados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Calcados {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Calcado> calcado;

    public List<Calcado> getCalcado() {
        return calcado;
    }

    public void setCalcado(List<Calcado> calcado) {
        this.calcado = calcado;
    }
}