/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Programa verifica se um arquivo é ou não um arquivo JPEG.
 */
public class Exercicio2 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo.
     */
    public static void main(String[] args) {
        try {
            String[] bytesDeMarcacao = getBytesDeMarcacao(args[0]);

            if (isImage(bytesDeMarcacao[0], bytesDeMarcacao[1])) {
                System.out.println("É uma imagem jpg/jpeg");
            } else {
                System.out.println("Não é uma imagem jpg/jpeg");
            }

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

    /**
     * Obtêm código hex dos bytes iniciais e finais de um arquivo a partir do seu filepath.
     *
     * @param filepath Path de um arquivo.
     * @return Array de string contendo o código hex dos bytes
     * iniciais e finais do arquivo em questão.
     */
    public static String[] getBytesDeMarcacao(String filepath) throws IOException {
        File file = new File(filepath);
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
        byte[] byteArray = new byte[4];

        randomAccess.seek(0);
        randomAccess.read(byteArray, 0, 2);

        randomAccess.seek(randomAccess.length() - 2);
        randomAccess.read(byteArray, 2, 2);

        String[] bytesDeMarcacao = new String[2];

        bytesDeMarcacao[0] = Integer.toHexString(byteArray[0] & 0xFF) +
                Integer.toHexString(byteArray[1] & 0xFF);

        bytesDeMarcacao[1] = Integer.toHexString(byteArray[2] & 0xFF) +
                Integer.toHexString(byteArray[3] & 0xFF);

        return bytesDeMarcacao;
    };

    /**
     * Checa se os bytes de marcação correspodem de de um arquivo imagem (jpeg).
     *
     * @param startHexString Código hex, em string, dos bytes iniciais de um arquivo.
     * @param endHexString Código hex, em string, dos bytes finais de um arquivo.
     * @return Booleno referente a checagem.
     */
    public static boolean isImage(String startHexString, String endHexString) throws IOException {
        return startHexString.equals("ffd8") && endHexString.equals("ffd9");
    }

}
