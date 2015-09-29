package Ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		String viewText;
		PrintWriter result = null;
		try {
			result = new PrintWriter("frases.txt");
			System.out.println("introduce texto:");
			text = sc.nextLine();
			if (text.compareTo("") != 0) {
				result.println(text);
				text = sc.nextLine();
			}
			if (text.compareTo("") == 0) {
				FileReader fr = new FileReader("frases.txt");
				result.flush();
				result.close();
				sc.close();
				BufferedReader bf = new BufferedReader(fr);
				text = bf.readLine();
				while (text != null) {
					System.out.println(text);
					text = bf.readLine();
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
