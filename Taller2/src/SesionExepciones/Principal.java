package SesionExepciones;

import java.util.Scanner;
import SesionExepciones.Vendedor;

public class Principal {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("El nombre del vendedor es: ");
		String nombre = teclado.next();
		System.out.println("Los Apellidos del vendedor son: ");
		String apellido = teclado.next();
		
		Vendedor vendedor = new Vendedor(nombre,apellido);
		
		System.out.println("Edad del vendedor es: ");
		int edad=teclado.nextInt();
		
		vendedor.verificarEdad(edad);
		vendedor.imprimir();
		
	/*	try {
			System.out.println("Ingresando al primer try ");
			
			double cociente = 1000/0;
			System.out.println("Despues de la division ");
			
		} catch (ArithmeticException e) {
			System.out.println("Se esta dividiendo en 0");
				
		}finally {
			System.out.println("Ingresando al finally");
		}
		*/	
	}

}
