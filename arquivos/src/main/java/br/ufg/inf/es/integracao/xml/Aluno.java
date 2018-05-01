package br.ufg.inf.es.integracao.xml;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aluno on 30/04/18.
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
