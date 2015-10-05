package Ejercicio6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		String text;
		try {
			out = new BufferedWriter(new FileWriter("G:/prueba.txt", true));
			out.newLine();
			System.out.println("escribe lo que quieras (para finalizar pulsa enter): ");
			text = sc.nextLine();
			while (text.compareTo("") != 0) {
				out.write(text);
				System.out.println("escribe lo que quieras (para finalizar pulsa enter): ");
				text = sc.nextLine();
			}
		} catch (IOException e) {
			e.getMessage();
		}
		out.close();
		sc.close();
	}
}