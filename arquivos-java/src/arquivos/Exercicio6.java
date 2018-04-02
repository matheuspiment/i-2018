package arquivos;

import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Exercicio6 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);

			DataInputStream dis = new DataInputStream(file);
			int valor = dis.readInt();
			// dis.close();
			System.out.println(valor);
			byte[] b = new byte[3];
			dis.read(b);
			String str = new String(b, "UTF-8");
			System.out.println(str);
			dis.close();


	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
