/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Aluno.java
 * Purpose: Abstrair a entidade aluno.
 *
 * @author Matheus Ribeiro Pimenta Nunes
 */
@XmlRootElement(name = "aluno")
public class Aluno {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
