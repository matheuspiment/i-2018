/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_02;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Turma.java
 * Purpose: Representar uma lista de calçados.
 */
@JacksonXmlRootElement(localName = "calcados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Estoque {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Sapato> sapatos;
    private List<Tenis> tenis;

    public List<Sapato> getSapatos() {
        return sapatos;
    }

    public void setSapatos(List<Sapato> sapatos) {
        this.sapatos = sapatos;
    }

    public List<Tenis> getTenis() {
        return tenis;
    }

    public void setTenis(List<Tenis> tenis) {
        this.tenis = tenis;
    }
}