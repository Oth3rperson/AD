package Ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		String a,b,c;
		int num1,num2;
		int resultado = 0;
		try {
			out = new BufferedWriter(new FileWriter("G:/sumas.txt", true));
			System.out.println("Escribe el primer numero: ");
			a = sc.nextLine();
			out.write("-------------------------------");
			out.newLine();
			out.write("El primer numero es: "+a);
			out.newLine();
			System.out.println("Escribe el segundo numero: ");
			b = sc.nextLine();
			out.write("El segundo numero es: "+b);
			out.newLine();
			num1 = Integer.parseInt(a);
			num2 = Integer.parseInt(b);
			resultado = num1 + num2;
			System.out.println("la suma de "+ num1 +" y "+ num2 + " es: "+ resultado);
			c = Integer.toString(resultado);
			out.write("el resultado es: "+c);
			out.newLine();
			out.write("-------------------------------");
			
		} catch (IOException e) {
			e.getMessage();
		}
		out.close();
		sc.close();
	}
}