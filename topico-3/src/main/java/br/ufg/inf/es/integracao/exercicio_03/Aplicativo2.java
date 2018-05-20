package br.ufg.inf.es.integracao.exercicio_03;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

/**
 * Programa que desserializa uma instancia da classe Turma persistida em um arquivo XML.
 */
public class Aplicativo2 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Pathname do arquivo XML a ser lido.
     */
    public static void main(String[] args) throws IOException {
        Turma turma = deserializeFromXmlFile(args[0]);
    }

    private static Turma deserializeFromXmlFile(String pathname) throws IOException {
        File file = new File(pathname);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        Turma value = xmlMapper.readValue(xml, Turma.class);

        return value;
    }

    private static String inputStreamToString(InputStream is) throws IOException {
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
