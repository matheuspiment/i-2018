/*
 * Copyright (c) 2016.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.manipulacao;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Programa para persistir uma sequência de caracteres em um arquivo.
 */
public class Exercicio4 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo sequido da string/texto a ser armazenado no arquivo em questão.
     */
    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter(args[0], "UTF-8");

            printWriter.write(args[1]);
            printWriter.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

}
