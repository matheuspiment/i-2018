/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_02;

/**
 * Sapato.java
 * Purpose: Abstrair o objeto sapato.
 */
public class Sapato extends Calcado {
    private int[] cor = new int[] { 0, 0, 0};

    public int[] getCor() {
        return cor;
    }

    public void setCor(int[] cor) {
        this.cor = cor;
    }
}
