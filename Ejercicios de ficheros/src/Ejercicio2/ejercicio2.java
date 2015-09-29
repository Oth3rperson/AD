package Ejercicio2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ejercicio2 {

	public static void main(String[] args) {
		File archivoOrigen = new File("ejercicio1.txt");
		File archivoDestino = new File("ejercicio2.txt");
		try{
			InputStream in = new FileInputStream(archivoOrigen);
			OutputStream out = new FileOutputStream(archivoDestino);
			
			byte[] buffer = new byte[1024];
			int line;
			while((line = in.read(buffer)) > 0){
				out.write(buffer, 0, line);
			}
			
			in.close();
			out.close();
			
		}catch(IOException e){
			e.getMessage();
		}

	}

}
