/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio_02;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.ArrayList;

/**
 * Programa que lê um arquivo XML contendo uma "lista" de calçados, onde estes podem ser tênis ou sapatos.
 */
public class Exercicio2 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Pathname do arquivo XML a ser lido.
     */
    public static void main(String[] args) throws IOException, XMLStreamException {

        XMLStreamReader arquivo = getXMLFIle(args[0]);
        XmlMapper xmlMapper = new XmlMapper();
        Calcados calcados = deserializeCalcados(arquivo, xmlMapper);

    }

    private static XMLStreamReader getXMLFIle(String filename) throws FileNotFoundException, XMLStreamException {
        File file = new File(filename);
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(file));

        return reader;
    }

    private static  Calcados deserializeCalcados(XMLStreamReader reader, XmlMapper xmlMapper) throws XMLStreamException, IOException {
        Calcados calcados = new Calcados();
        ArrayList<Tenis> tenisArray = new ArrayList<Tenis>();
        ArrayList<Sapato> sapatosArray = new ArrayList<Sapato>();

        int evento = reader.next();
        while (evento != XMLStreamConstants.END_DOCUMENT) {
            if (evento == XMLStreamConstants.START_ELEMENT) {
                String calcado = reader.getLocalName();
                if (calcado.equals("tenis")) {
                    Tenis tenis = xmlMapper.readValue(reader, Tenis.class);
                    tenisArray.add(tenis);
                } else if (calcado.equals("sapato")){
                    Sapato sapato = xmlMapper.readValue(reader, Sapato.class);
                    sapatosArray.add(sapato);
                }

            }
            evento = reader.next();
        }

        calcados.setSapatos(sapatosArray);
        calcados.setTenis(tenisArray);

        return calcados;
    }
}
