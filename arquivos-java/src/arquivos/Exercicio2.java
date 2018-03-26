package arquivos;

import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;

public class Exercicio2	 {

	public static void main(String[] args) {
	    try {
		File file = new File(args[0]);
		RandomAccessFile randomAccess = new RandomAccessFile(file, "r");
		byte[] byteArray = new byte[4];

		randomAccess.seek(0);
		randomAccess.read(byteArray, 0, 2);

		randomAccess.seek(randomAccess.length() - 2);
		randomAccess.read(byteArray, 2, 2);

		String firstPair = Integer.toHexString(byteArray[0] & 0xFF) +
			Integer.toHexString(byteArray[1] & 0xFF);

		String lastPair = Integer.toHexString(byteArray[2] & 0xFF) +
			Integer.toHexString(byteArray[3] & 0xFF);

		if (firstPair.equals("ffd8") && lastPair.equals("ffd9")) {
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
