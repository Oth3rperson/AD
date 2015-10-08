package Ejercicio5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f;
		int lineas = 0;
		
		try {
			System.out.println("Escriba el nombre del archivo: ");
			String archivo = sc.nextLine();
		    f = new File(archivo);
		    if (f.exists()){
				Scanner sc2 = new Scanner(f);
				while (sc2.hasNextLine()){
					if (lineas<5){
						System.out.println(sc2.nextLine());
						lineas++;
					}else{
						System.out.println("pulsa enter para continuar: ");
						sc.nextLine();
						lineas = 0;
					}
				}
				sc2.close();
			}
			else
				System.out.println("error");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	sc.close();
	}
}
