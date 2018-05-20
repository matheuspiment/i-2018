/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_04;

import java.util.Calendar;

/**
 * Identificador.java
 * Purpose: Abstrair um indetinficador.
 */
public class Identificador {
    private String designacao;
    private String area;
    private String emissor;
    private Calendar data;
    private String tipo;
    private Utilizacao utilizacao;
    private Vinculo vinculo;
    private Ctps ctps;
    private Certidao certidao;
    private TituloEleitoral tituloEleitoral;

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Utilizacao getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(Utilizacao utilizacao) {
        this.utilizacao = utilizacao;
    }

    public Vinculo getVinculo() {
        return vinculo;
    }

    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }

    public Ctps getCtps() {
        return ctps;
    }

    public void setCtps(Ctps ctps) {
        this.ctps = ctps;
    }

    public Certidao getCertidao() {
        return certidao;
    }

    public void setCertidao(Certidao certidao) {
        this.certidao = certidao;
    }

    public TituloEleitoral getTituloEleitoral() {
        return tituloEleitoral;
    }

    public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }
}
