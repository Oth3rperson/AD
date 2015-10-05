package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
        
        try {
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Primer archivo: ");
            FileReader fr1 = new FileReader(sc.nextLine());
            System.out.println("Segundo archivo: ");
            FileReader fr2 = new FileReader(sc.nextLine());
                
            BufferedReader bf1 = new BufferedReader(fr1);
            BufferedReader bf2 = new BufferedReader(fr2);
                
            String sCadena1,sCadena2;
            boolean iguales = true;         
                
            sCadena1 = bf1.readLine();
            sCadena2 = bf2.readLine();
                
            while ((sCadena1!=null) && (sCadena2!=null) && iguales) {
            	
                if (!sCadena1.equals(sCadena2)){
                	iguales = false;
                }
                sCadena1 = bf1.readLine();
                sCadena2 = bf2.readLine();    
            }
            while(iguales == false){
            	
            }
            bf1.close();
            bf2.close();
                
            if ((iguales) && (sCadena1==null) && (sCadena2==null))
                System.out.println("Los ficheros son iguales");
            else
                System.out.println("Los ficheros son diferentes");
                        
                 
        } catch (FileNotFoundException e){
                e.getMessage();
        } catch (IOException e){
                e.getMessage();
        }
	}
}
