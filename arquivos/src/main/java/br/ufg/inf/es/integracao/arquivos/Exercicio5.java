/*
 * Copyright (c) 2016.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.arquivos;

import java.io.*;

/**
 * Programa que converte um arquivo texto em um arquivo
 * contendo uma sequência de bytes correspondente.
 */
public class Exercicio5 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo UTF-8 seguido do path de um arquivo de destino.
     */
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream(args[0]);
            InputStreamReader inputReader = new InputStreamReader(file, "UTF-8");
            BufferedReader bufferReader = new BufferedReader(inputReader);

            FileOutputStream outputFile = new FileOutputStream(args[1] + ".dat");
            DataOutputStream dataOutput = new DataOutputStream(outputFile);

            String linha;
            while ((linha = bufferReader.readLine()) != null) {

                byte[] linhaToByte = linha.getBytes("UTF-8");
                int byteAmount = linhaToByte.length;
                dataOutput.writeInt(byteAmount);
                dataOutput.write(linhaToByte, 0, byteAmount);

            }

            bufferReader.close();
            dataOutput.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

}
