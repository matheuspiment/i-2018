package arquivos;

import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.io.IOException;

public class Exercicio6 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);
			DataInputStream dis = new DataInputStream(file);

			byte[] intByte = new byte[4];
			int lineByteAmount;
			while ((lineByteAmount = dis.read(intByte)) != -1) {
				lineByteAmount = ByteBuffer.wrap(intByte).getInt();
				byte[] byteArray = new byte[lineByteAmount];
				dis.read(byteArray);
				String str = new String(byteArray, "UTF-8");
				System.out.println(str);
			}

			dis.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
