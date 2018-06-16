/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.entidades;

import java.util.List;

/**
 * Cria uma instância de nome de um indivíduo.
 */
public class Nome {

    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private String prefereido;
    private String usoCondicional;
    private List<Utilizacao> utilizacoe;
    private List<Representacao> representacao;

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public String getPrefereido() {
        return prefereido;
    }

    public void setPrefereido(String prefereido) {
        this.prefereido = prefereido;
    }

    public String getUsoCondicional() {
        return usoCondicional;
    }

    public void setUsoCondicional(String usoCondicional) {
        this.usoCondicional = usoCondicional;
    }

    public List<Utilizacao> getUtilizacoe() {
        return utilizacoe;
    }

    public void setUtilizacoe(List<Utilizacao> utilizacoe) {
        this.utilizacoe = utilizacoe;
    }

    public List<Representacao> getRepresentacao() {
        return representacao;
    }

    public void setRepresentacao(List<Representacao> representacao) {
        this.representacao = representacao;
    }

}
