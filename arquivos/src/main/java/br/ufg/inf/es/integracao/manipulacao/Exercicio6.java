/*
 * Copyright (c) 2016.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.manipulacao;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Programa que converte um arquivo contendo uma sequência de bytes em um arquivo
 * texto correspondente.
 */
public class Exercicio6 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo.
     */
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(args[0]);
            DataInputStream dis = new DataInputStream(file);

            byte[] intByte = new byte[4];
            int lineByteAmount;

            while ((lineByteAmount = dis.read(intByte)) != -1) {

                lineByteAmount = ByteBuffer.wrap(intByte).getInt();
                byte[] byteArray = new byte[lineByteAmount];
                dis.read(byteArray);
                String str = new String(byteArray, "UTF-8");
                System.out.println(str);

            }

            dis.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

}
