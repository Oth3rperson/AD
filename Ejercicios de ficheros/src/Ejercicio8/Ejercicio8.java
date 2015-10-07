package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
    	
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int opcion = 0;
        Datos contactos = new Datos();
        while (opcion != 3) {
            System.out.println("Agenda");
            System.out.println("1-Nuevo contacto");
            System.out.println("2-Leer agenda");
            System.out.println("3-Salir");
            opcion = sc1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe nombre: ");
                    contactos.setNombre(sc2.nextLine());
                    System.out.println("Escribe apellido: ");
                    contactos.setApellidos(sc2.nextLine());
                    System.out.println("Escribe direccion: ");
                    contactos.setDireccion(sc2.nextLine());
                    System.out.println("Escribe poblacion: ");
                    contactos.setPoblacion(sc2.nextLine());
                    System.out.println("Escribe telefono: ");
                    contactos.setTelefono(sc2.nextLine());
                    System.out.println("Escribe edad: ");
                    contactos.setfNacimiento(sc2.nextLine());
                   
                    contactos.getNombre();
                    contactos.getApellidos();
                    contactos.getDireccion();
                    contactos.getPoblacion();
                    contactos.getTelefono();
                    contactos.getfNacimiento();
                    break;
                case 2:
                	contactos.agenda();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc1.close();
        sc2.close();
    }
}
