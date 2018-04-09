/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.manipulacao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programa que exibe o conteúdo de arquivo texto, formato UTF-8, na saída padrão.
 */
public class Exercicio3 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo.
     */
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(args[0]);
            InputStreamReader inputReader = new InputStreamReader(file, "UTF-8");
            BufferedReader bufferReader = new BufferedReader(inputReader);

            String linha;
            while ((linha = bufferReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferReader.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

}
