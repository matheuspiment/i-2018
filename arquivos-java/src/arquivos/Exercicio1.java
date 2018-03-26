package arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio1 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);
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
