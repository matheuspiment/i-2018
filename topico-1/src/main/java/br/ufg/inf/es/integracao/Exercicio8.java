/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Programa exibe o conteudo de uma "linha" de um arquivo contendo uma sequência de bytes.
 */
public class Exercicio8 {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args Path de um arquivo UTF-8 seguido do índice da linha a ser impressa.
     */
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(args[0]);
            DataInputStream dis = new DataInputStream(file);
            int lineIndexToRead = Integer.parseInt(args[1]);

            byte[] intByte = new byte[4];
            int lineIndex;
            int lineByteAmount;
            int byteAmountToSkip = 0;

            while ((lineIndex = dis.read(intByte)) != -1) {
                lineIndex = ByteBuffer.wrap(intByte).getInt();

                if (lineIndex == lineIndexToRead) {
                    lineByteAmount = dis.read(intByte);
                    lineByteAmount = ByteBuffer.wrap(intByte).getInt();

                    byte[] byteArray = new byte[lineByteAmount];
                    dis.read(byteArray);

                    String str = new String(byteArray, "UTF-8");
                    System.out.println(str);
                } else {
                    byteAmountToSkip = dis.read(intByte);
                    byteAmountToSkip = ByteBuffer.wrap(intByte).getInt();
                    dis.skipBytes(byteAmountToSkip);
                }

            }

            dis.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }

}
