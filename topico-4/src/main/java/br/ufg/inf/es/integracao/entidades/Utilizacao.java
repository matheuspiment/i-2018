/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.entidades;

import java.util.Calendar;

/**
 * Cria uma instância de utilização.
 */
public class Utilizacao {

    private String uso;
    private Calendar dataInicial;
    private Calendar dataFinal;

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

}
