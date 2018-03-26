package arquivos;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio3 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);
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
