/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_04;

import java.io.*;

/**
 * Aplicaçao que serializa e desserializa instancias da classe Individuo.
 */
public class Exercicio4 {

    /**
     * Metodo principal do programa.
     *
     * @param args Argumentos de programa - ignorados.
     */
    public static void main(String[] args) throws IOException {

        // Exemplo de uso do programa.

        Individuo individuo = new Individuo();

        writeFile(Individuo.serializeToXmlString(individuo), args[0]);

        Individuo individuo1 = deserializeFromXmlFile(args[0]);

    }

    private static void writeFile(String xmlString, String pathname) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter file = new PrintWriter(pathname,"UTF-8" );
        file.write(xmlString);
        file.close();
    }

    private static Individuo deserializeFromXmlFile(String pathname) throws IOException {
        File file = new File(pathname);
        Individuo individuo = Individuo.deserializeFromIS(new FileInputStream(file));

        return individuo;
    }
}
