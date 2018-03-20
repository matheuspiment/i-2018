package arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

	    System.out.printf("Informe o nome de arquivo texto:\n");
	    String filename = reader.nextLine();
	    reader.close();
	    	
	    try {
	    	FileInputStream file = new FileInputStream(filename);
	    	DataInputStream dataInput = new DataInputStream(file);

	    	int valor = dataInput.readInt();
	    	dataInput.close();
	    	
	    	System.out.println(Integer.toHexString(valor));
	    	
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
