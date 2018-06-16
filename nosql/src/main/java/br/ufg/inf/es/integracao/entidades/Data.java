/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.entidades;

import java.util.Calendar;

/**
 * Cria uma instacia de data.
 */
public class Data {

    private Calendar data;
    private String acuracia;

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }
}
