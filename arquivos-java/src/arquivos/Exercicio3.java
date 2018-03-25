package arquivos;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

	    System.out.printf("Informe o nome de arquivo texto:\n");
	    String filename = reader.nextLine();
	    reader.close();

	    try {
	    	FileInputStream file = new FileInputStream(filename);
	    	InputStreamReader inputReader = new InputStreamReader(file, "UTF-8");
				BufferedReader bufferReader = new BufferedReader(inputReader);

				String linha;
				while ((linha = bufferReader.readLine()) != null) {
					System.out.println(linha);
				}

	    	bufferReader.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
