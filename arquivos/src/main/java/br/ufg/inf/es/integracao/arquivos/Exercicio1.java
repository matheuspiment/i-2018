/*
 * Copyright (c) 2016.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Programa que recebe como argumento um nome de arquivo e exibe os 4 primeiros bytes (inteiro de 32 bits)
 * em formato hexadecimal na saída padrão.
 */
public class Exercicio1 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo.
     */
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(args[0]);
            DataInputStream dataInput = new DataInputStream(file);

            int valor = dataInput.readInt();
            dataInput.close();

            System.out.println(Integer.toHexString(valor));

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

}