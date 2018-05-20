/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_03;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Programa que serializa e persiste uma instancia da classe Turma em um arquivo XML.
 */
public class Apicativo1 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Pathname do arquivo XML a ser escrito.
     */
    public static void main(String[] args, Turma turma) throws IOException {
        String xmlString = serializedToXmlString(turma);
        writeFile(xmlString, args[0]);
    }

    private static String serializedToXmlString(Turma turma) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(turma);

        return xml;
    }

    private static void writeFile(String xmlString, String pathname) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter file = new PrintWriter(pathname,"UTF-8" );
        file.write(xmlString);
        file.close();
    }
}
