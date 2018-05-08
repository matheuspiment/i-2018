/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.topico_3.xml;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Calcado.java
 * Purpose: Abstrair o objeto calçado.
 *
 * @author Matheus Ribeiro Pimenta Nunes
 */
@XmlRootElement(name = "calcado")
public class Calcado {
    private String marca;
    private float preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
