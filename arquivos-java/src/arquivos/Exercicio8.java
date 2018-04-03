package arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.IOException;

public class Exercicio8 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);
			DataInputStream dis = new DataInputStream(file);
			int lineIndexToRead = Integer.parseInt(args[1]);

			byte[] intByte = new byte[4];
			int lineIndex;
			int lineByteAmount;
			int offset = 0;

			do {
				dis.skipBytes(offset);
				lineIndex = dis.read(intByte);
				lineIndex = ByteBuffer.wrap(intByte).getInt();
				// System.out.println(lineIndex);
				if (lineIndex > lineIndexToRead) {
					System.out.println("Indice inválido");
				}

				if (lineIndex != -1 && lineIndex == lineIndexToRead) {
					lineByteAmount = dis.read(intByte);
					lineByteAmount = ByteBuffer.wrap(intByte).getInt();

					byte[] byteArray = new byte[lineByteAmount];
					dis.read(byteArray);

					String str = new String(byteArray, "UTF-8");
					System.out.println(str);

				} else {
					offset = dis.read(intByte);
					offset = ByteBuffer.wrap(intByte).getInt();
				}

			} while (lineIndex != -1 && lineIndex < lineIndexToRead);

			dis.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
