package cript_object;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CriptObject obj = new CriptObject();
		

		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Dame una frase");
		 String frase = scan.next();
		 
		 System.out.println("Cuanto lo quieres desplazar?");
		 int desplazamiento = scan.nextInt();
		 
		 String texto = obj.codificarCesar(frase, desplazamiento);
		
		System.out.println("Texto codificado " + texto);
		
		 System.out.println("Cuanto lo quieres desplazar para descodificar?");
		 int desplazamiento2 = scan.nextInt();
		 
		 String texto2 = obj.descodificar(frase, desplazamiento2);
		 System.out.println("texto descodificado " + texto2);
	}

}
