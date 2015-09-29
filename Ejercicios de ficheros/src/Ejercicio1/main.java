package Ejercicio1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void Main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text;
		PrintWriter result = null;
		try{
			result = new PrintWriter("ejercicio1.txt");
			System.out.println("introduce texto:");
			text = sc.nextLine();
			while (text.compareTo("fin") != 0) {
				result.println(text);
				text = sc.nextLine();
			}
			result.flush();
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		result.close();
		sc.close();
	}
}
