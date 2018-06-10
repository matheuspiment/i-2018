/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.entidades;

import java.util.Calendar;

/**
 * Cria uma instância da nacionalidade de um parciente.
 */
public class Nacionalidade {

    private String municipio;
    private String estado;
    private String pais;
    private Calendar dataEntradaNoPais;

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

    public Calendar getDataEntradaNoPais() {
        return dataEntradaNoPais;
    }

    public void setDataEntradaNoPais(Calendar dataEntradaNoPais) {
        this.dataEntradaNoPais = dataEntradaNoPais;
    }

}
