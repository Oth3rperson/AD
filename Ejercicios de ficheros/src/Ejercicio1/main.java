package Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File archive = new File("registroDeUsuario.txt");
		Scanner sc = new Scanner(System.in);
		String text;
		PrintWriter result = null;
		text = sc.nextLine();
		while (!sc.equals("fin")) {
			result.println(text);
			text = sc.nextLine();
		}
		result.close();
	}

}
