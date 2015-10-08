package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cad1 = "";
		String cad2 = "";
		File primero, segundo;
		int cEq = 0;
		int res = 0;
		int l1 = cad1.length();
		int l2 = cad2.length();

		System.out.println("primer archivo: ");
		cad1 = teclado.nextLine();
		primero = new File(cad1);
		if (primero.exists()) {
			System.out.println("segundo archivo: ");
			cad1 = teclado.nextLine();
			segundo = new File(cad1);
			try {
				if (segundo.exists()) {
					Scanner sc1 = new Scanner(primero);
					Scanner sc2 = new Scanner(segundo);

					while (sc1.hasNextLine()) {

						cad1 = sc1.nextLine();

						if (sc2.hasNextLine()) {

							cad2 = sc2.nextLine();
							if (l1 <= l2) {
								for (int i = 0; i < l1; i++)
									if (cad1.charAt(i) == cad2.charAt(i))
										res++;
							} else {
								for (int i = 0; i < l2; i++)
									if (cad1.charAt(i) == cad2.charAt(i))
										res++;
							}
							if (cad1.compareTo(cad2) == 0) {
								cEq += cad1.length();
							}
						}
						System.out.println("Caracteres iguales: " + cEq);
					}
				} else
					System.out.println("No se encontro el archivo especificado");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} else
			System.out.println("No se encontro el archivo especificado");
	}
}