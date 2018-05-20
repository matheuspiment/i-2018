/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_04;

/**
 * DadoDemografico.java
 * Purpose: Abstrair um dado demografico.
 */
public class DadoDemografico {
    private Data nascimento;
    private Data obito;
    private Nacionalidade nacionalidade;
    private String sexo;
    private String nomeMae;
    private String nomePai;
    private String situacaoFamiliar;
    private String raca;
    private String comentario;
    private String fonteNotificacaoObito;
    private String nascimentoPluralidade;
    private String nascimentoOrdem;
    private String nascimentoseguinte;

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public Data getObito() {
        return obito;
    }

    public void setObito(Data obito) {
        this.obito = obito;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFonteNotificacaoObito() {
        return fonteNotificacaoObito;
    }

    public void setFonteNotificacaoObito(String fonteNotificacaoObito) {
        this.fonteNotificacaoObito = fonteNotificacaoObito;
    }

    public String getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    public void setNascimentoPluralidade(String nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    public String getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(String nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public String getNascimentoseguinte() {
        return nascimentoseguinte;
    }

    public void setNascimentoseguinte(String nascimentoseguinte) {
        this.nascimentoseguinte = nascimentoseguinte;
    }
}
