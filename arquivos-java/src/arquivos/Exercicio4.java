package arquivos;

import java.io.PrintWriter;
import java.io.IOException;

public class Exercicio4 {

	public static void main(String[] args) {

	    try {
				PrintWriter printWriter = new PrintWriter(args[0], "UTF-8");
				
				printWriter.write(args[1]);
				printWriter.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
