package arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2	 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

	    System.out.printf("Informe o nome de arquivo texto:\n");
	    String filename = reader.nextLine();
	    reader.close();

	    try {
	    	FileInputStream file = new FileInputStream(filename);
	    	DataInputStream dataInput = new DataInputStream(file);

				int tamanho = file.available();
				byte[] buffer = new byte[tamanho];
				dataInput.read(buffer);
	    	dataInput.close();

				if (buffer[1] == -40 && buffer[tamanho - 1] == -39) {
					System.out.println("É uma imagem jpg/jpeg");
				} else {
					System.out.println("Não é uma imagem jpg/jpeg");
				}

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
