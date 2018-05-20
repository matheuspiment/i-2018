/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_04;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.List;

/**
 * Individuo.java
 * Purpose: Abstrair um individuo.
 */
public class Individuo {
    private DadoDemografico dadoDemografico;
    private List<Endereco> enderecos;
    private List<Vinculo> vinculos;
    private List<Identificador> identificadores;
    private List<Nome> nomes;
    private List<Comunicacao> comunicacoes;

    public DadoDemografico getDadoDemografico() {
        return dadoDemografico;
    }

    public void setDadoDemografico(DadoDemografico dadoDemografico) {
        this.dadoDemografico = dadoDemografico;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    public void setVinculos(List<Vinculo> vinculos) {
        this.vinculos = vinculos;
    }

    public List<Identificador> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(List<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    public List<Nome> getNomes() {
        return nomes;
    }

    public void setNomes(List<Nome> nomes) {
        this.nomes = nomes;
    }

    public List<Comunicacao> getComunicacoes() {
        return comunicacoes;
    }

    public void setComunicacoes(List<Comunicacao> comunicacoes) {
        this.comunicacoes = comunicacoes;
    }

    /**
     * Retorna uma string em formato XML de uma instancia da classe Individuo.
     *
     * @param individuo Individuo a ser serializado.
     * @return String Instancia serializada em formato XML
     */
    public static String serializeToXmlString(Individuo individuo) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(individuo);

        return xml;
    }

    /**
     * Retorna a instancia java de um individuo a partir do InputStream do mesmo..
     *
     * @param is InputStream do arquivo XML contendo a instancia de um individuo.
     * @return Individuo Instancia de um individuo.
     */
    public static Individuo deserializeFromIS(InputStream is) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(is);
        Individuo individuo = xmlMapper.readValue(xml, Individuo.class);

        return individuo;
    }

    private static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

}
