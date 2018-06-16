/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Cria uma instância de individuo.
 */
@Document
public class Individuo {

    @Id
    private String key;
    private List<Endereco> enderecos;
    private DadoDemografico dadoDemografico;
    private List<Comunicacao> comunicacoes;
    private List<Nome> nomes;
    private List<Identificador> identificadores;
    private List<Vinculo> vinculos;

    public String getKey() { return key; }

    public void setKey(String key) { this.key = key; }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public DadoDemografico getDadoDemografico() {
        return dadoDemografico;
    }

    public void setDadoDemografico(DadoDemografico dadoDemografico) {
        this.dadoDemografico = dadoDemografico;
    }

    public List<Comunicacao> getComunicacoes() {
        return comunicacoes;
    }

    public void setComunicacoes(List<Comunicacao> comunicacoes) {
        this.comunicacoes = comunicacoes;
    }

    public List<Nome> getNomes() {
        return nomes;
    }

    public void setNomes(List<Nome> nomes) { this.nomes = nomes; }

    public List<Identificador> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(List<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    public void setVinculos(List<Vinculo> vinculos) {
        this.vinculos = vinculos;
    }

}
