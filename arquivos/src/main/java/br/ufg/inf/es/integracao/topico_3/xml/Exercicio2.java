/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.topico_3.xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Programa que lê um arquivo XML contendo uma "lista" de calçados, onde estes podem ser tênis ou sapatos.
 */
public class Exercicio2 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados.
     */
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        FileInputStream fis = new FileInputStream("calcados.xml");
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(fis);

        int evento = reader.next();
        while (evento != XMLStreamConstants.END_DOCUMENT) {
            if (evento == XMLStreamConstants.START_ELEMENT) {
                System.out.println(reader.getLocalName());
            }

            if (evento == XMLStreamConstants.CHARACTERS) {
                System.out.println(reader.getText());
            }

            evento = reader.next();
        }

    }
}
