/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_04;

import java.util.Calendar;

/**
 * Nacionalidade.java
 * Purpose: Abstrair uma nacionalidade.
 */
public class Nacionalidade {
    private String municipio;
    private String estado;
    private String pais;
    private Calendar entradaPais;

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Calendar getEntradaPais() {
        return entradaPais;
    }

    public void setEntradaPais(Calendar entradaPais) {
        this.entradaPais = entradaPais;
    }
}
