package arquivos;

import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Exercicio5 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);

			// DataInputStream dis = new DataInputStream(file);
			// int valor = dis.readInt();
			// dis.close();
			// System.out.println(valor);

	    	InputStreamReader inputReader = new InputStreamReader(file, "UTF-8");
			BufferedReader bufferReader = new BufferedReader(inputReader);

			FileOutputStream outputFile = new FileOutputStream(args[1] + ".dat");
			DataOutputStream dataOutput = new DataOutputStream(outputFile);

			String linha;
			while ((linha = bufferReader.readLine()) != null) {

				byte[] linhaToByte = linha.getBytes("UTF-8");
				int byteAmount = linhaToByte.length;

				dataOutput.writeInt(byteAmount);
				dataOutput.write(linhaToByte, 0, byteAmount);

			}

	    	bufferReader.close();
			dataOutput.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
