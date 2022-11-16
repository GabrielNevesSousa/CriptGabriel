package cript_object;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		
		System.out.println("1- Codificar en cesar");
		System.out.println("2- Codificar en monoalfabetico");
		System.out.println("3- Codificar en polialfabetico");
		int eleccion = 0;
		
		
		 eleccion = scan.nextInt();
				 
				 switch(eleccion) {
				  case 1:
					  
					  String resu;
					  System.out.println("Dame una frase");
					 String frase = scan.next();
					 
					 System.out.println("Cuanto lo quieres desplazar?");
					 int desplazamiento = scan.nextInt();
					 
					 String texto = CriptObject.codificarCesar(frase, desplazamiento);
					
					System.out.println("Texto codificado " + texto);
					
					resu = texto;
					
					System.out.println("Cuanto lo quieres desplazar para descodificar?");
					
					int desplazamiento2 = scan.nextInt();
					
					resu = CriptObject.descifradoCesar(resu, desplazamiento2);
					
					System.out.println("texto descodificado " + resu);
				    break;
				  case 2:
				   
				    break;
				  default:
				    
				};
		 
		
		
		
		
	}

}
