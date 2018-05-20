/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_04;

import java.util.Calendar;

/**
 * Data.java
 * Purpose: Abstrair uma data.
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
