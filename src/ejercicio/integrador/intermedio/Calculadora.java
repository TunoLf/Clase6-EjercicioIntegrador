package ejercicio.integrador.intermedio;

import java.util.Scanner;

public class Calculadora {

	static double sumar(double unNumero,double otroNumero)  {
	    return unNumero + otroNumero;
	  }
	
	static double restar(double unNumero,double otroNumero)  {
	    return unNumero - otroNumero;
	  }
	
	static double dividir(double unNumero,double otroNumero)  {
	    return unNumero / otroNumero;
	  }
	
	static double multiplicar(double unNumero,double otroNumero)  {
	    return unNumero * otroNumero;
	  }
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		char operador = 0;
		int opcion = 0;
		double numero2 = 0, resultado = 0; 
		boolean continuar = true;
		
		while (continuar == true) {
			System.out.println("Total: " + resultado);
			if (operador != '6') {
			
			// Pide al usuario elegir una operación de la calculadora
			System.out.print("Elegir un operador: +, -, *, o / (Seleccionar 5 para limpiar, o 6 para salir): ");
			operador = teclado.next().charAt(0);
		
			// Pide al usuario ingresar dos números
			if (operador != '5' && operador != '6') {
				
				if (resultado == 0) {
				System.out.print("Ingresar primer número: ");
				resultado = teclado.nextDouble(); }
				
				System.out.print("Ingresar segundo número: ");
				numero2 = teclado.nextDouble();
			}
			
			switch (operador) {
		
			case '+':
				System.out.print(resultado + " + " + numero2 + " = ");
				resultado = sumar(resultado,numero2);
				System.out.println(resultado);
				break;
			
			case '-':
				System.out.print(resultado + " - " + numero2 + " = ");
				resultado = restar(resultado,numero2);
				System.out.println(resultado);
				break;
		
			case '*':
				System.out.print(resultado + " * " + numero2 + " = ");
				resultado = multiplicar(resultado,numero2);
				System.out.println(resultado);
				break;
		
			case '/':
				System.out.print(resultado + " / " + numero2 + " = ");
				resultado = dividir(resultado,numero2);
				System.out.println(resultado);
				break;
			
			case '5':
				resultado = 0;
				System.out.println("Se ha limpiado el restulado a: " + resultado);
				break;
			
			case '6':
				teclado.close();
				continuar = false;
				break;
			
			}
			
			if (operador != '6') {
				System.out.print("OPCIONES: \n1. Sí\n2. No \n¿Desea continuar?: ");		
				opcion = teclado.nextInt();
				if (opcion == 2)  continuar = false;				 			
				}
			
			} // Cierre del IF
		} // Cierre del WHILE
	} // Cierre del MAIN
} // Cierre del programa 

