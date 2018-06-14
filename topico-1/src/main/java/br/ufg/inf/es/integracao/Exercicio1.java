/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
            DataInputStream dataInput = getDataInputFromFilePath(args[0]);

            System.out.println(Integer.toHexString(readIntFromDataInput(dataInput)));

            dataInput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gera uma instância DataInputStream a partir de um filepath.
     *
     * @param filepath Path de um arquivo.
     * @return DataInputStream do arquivo informado.
     */
    public static DataInputStream getDataInputFromFilePath(String filepath) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(filepath);
        return new DataInputStream(file);
    }

    /**
     * Retorna um inteiro contido no DataInputStream
     *
     * @param dataInput DataInputStream.
     * @return Inteiro lido.
     */
    public static int readIntFromDataInput(DataInputStream dataInput) throws IOException {
        return dataInput.readInt();
    }

}