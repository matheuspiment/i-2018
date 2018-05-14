/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Programa que lê um arquivo XML contendo uma "lista" de calçados, onde estes podem ser tênis ou sapatos.
 */
public class Exercicio2 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Ignorados.
     */
    public static void main(String[] args) throws IOException, XMLStreamException, JAXBException {

//        File file = new File("calcados.xml");
//        XmlMapper xmlMapper = new XmlMapper();
//        String xml = inputStreamToString(new FileInputStream(file));
//        Calcados value = xmlMapper.readValue(xml, Calcados.class);
//        System.out.println(value.getCalcados().get(0).getMarca());

        Calcado a1 = new Calcado();
        a1.setMarca("Nike");
        a1.setPreco(142);
        List<Calcado> calcados = new ArrayList<Calcado>();
        calcados.add(a1);
        calcados.add(a1);
        Calcados c = new Calcados();
        c.setCalcados(calcados);

        JAXBContext context = JAXBContext.newInstance(Calcados.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        m.marshal(c, System.out);
    }

    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
