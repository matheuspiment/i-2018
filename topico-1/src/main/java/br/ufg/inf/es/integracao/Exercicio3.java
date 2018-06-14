/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import java.io.*;
import java.util.*;

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
            BufferedReader bufferReader = bufferedReaderFromFilepath(args[0]);

            ArrayList<String> linhas = (ArrayList<String>) getLines(bufferReader);

            for (String linha: linhas) {
                System.out.println(linha);
            }

            bufferReader.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

    /**
     * Retorna uma instânica BufferedReader a partir de um filepath.
     *
     * @param filepath Path de um arquivo.
     * @return Instânica BufferedReader a partir de um filepath.
     */
    public static BufferedReader bufferedReaderFromFilepath(String filepath) throws FileNotFoundException,
            UnsupportedEncodingException {
        FileInputStream file = new FileInputStream(filepath);
        InputStreamReader inputReader = new InputStreamReader(file, "UTF-8");
        return new BufferedReader(inputReader);
    }

    /**
     * Retorna uma lista com o conteúdo das linhas de um BufferedReader.
     *
     * @param bufferedReader Uma instânica BufferedReader.
     * @return List contendo as linhas do BufferedReader.
     */
    public static List<String> getLines(BufferedReader bufferedReader) throws IOException {
        List<String> linhas = new ArrayList<String>();
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            linhas.add(linha);
        }

        return linhas;
    }

}
