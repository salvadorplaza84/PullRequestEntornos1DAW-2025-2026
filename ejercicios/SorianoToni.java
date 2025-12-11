package calculadora;

import java.util.Scanner;

public class Entregable03 {

	static Scanner sc = new Scanner(System.in); //Scanner en static para no crearlo en todas partes
	
	static void menu() { //Interfaz calculadora
		
		System.out.println("====CALCULADORA====");
		System.out.println("1. Suma");
	    System.out.println("2. Resta");
	    System.out.println("3. Multiplicación");
	    System.out.println("4. División");
	    System.out.println("5. Área de un rectángulo");
	    System.out.println("6. Área de un triángulo equilátero");
	    System.out.println("7. Área de un círculo");
	    System.out.println("8. Seno, Coseno y Tangente");
	    System.out.println("9. Salir");
	    System.out.println("Elige una opción:");
	}
	
	static int pedirNumeroEntero(int min, int max) { //Static para pedir números enteros
		int valor = sc.nextInt();
		while (valor < min || valor > max) {
			System.out.println("El valor está fuera del rango, vuelve a introducirlo: ");
			valor = sc.nextInt();
		}
		return valor;
	}
	
	static double pedirNumero(double min, double max) { //Static para pedir números enteros o decimales
		double valor = sc.nextDouble();
		while (valor < min || valor > max) {
			System.out.println("El valor está fuera del rango, vuelve a introducirlo: ");
			valor = sc.nextDouble();
		}
		return valor;
	}
	
	static void suma() { //Suma de 2 valores
		
		System.out.println("Introduce el primer valor de la suma: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el segundo valor de la suma: ");
		double b = sc.nextDouble();
		
		double resultado = a + b;
		System.out.println("El resultado es: "+resultado);
	}
	
	static void resta() { //Resta de 2 valores
		
		System.out.println("Introduce el primer valor de la resta: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el segundo valor de la resta: ");
		double b = sc.nextDouble();
		
		double resultado = a - b;
		System.out.println("El resultado es: "+resultado);
	}
	
	static void multiplicacion() { //Multiplicación de 2 valores
		
		System.out.println("Introduce el primer valor de la multiplicación: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el segundo valor de la multiplicación: ");
		double b = sc.nextDouble();
		
		double resultado = a * b;
		System.out.println("El resultado es: "+resultado);
	}
	
	static void division() { //División de 2 valores
		
		System.out.println("Introduce el primer valor de la división: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el segundo valor de la división: ");
		double b = sc.nextDouble();
		
		if (b == 0) { //Indicamos que no se puede dividir entre 0
			System.out.println("No se puede dividir entre 0");
		}else {
			double resultado = a / b;
			System.out.println("El resultado es: "+resultado);
		}
	}
	
	static void areaRect() { //Área de un rectángulo
		
		System.out.println("Introduce la base del rectángulo: ");
		double base = pedirNumero(0, 1000000); //Indicamos con el otro Static el rango de valores
		
		System.out.println("Introduce la altura del rectángulo: ");
		double altura = pedirNumero(0, 1000000);
		
		double resultado = base * altura;
		System.out.println("El área del rectángulo es: "+resultado);
	}
	
	static void areaEquilatero() { //Área de un triángulo equilátero
		
		System.out.println("Introduce la base del triángulo equilátero: ");
		double base = pedirNumero(0, 1000000);
		
		System.out.println("Introduce la altura del triángulo equilátero: ");
		double altura = pedirNumero(0, 1000000);
		
		double resultado = (base * altura) / 2;
		System.out.println("El área del triángulo es: "+resultado);
	}
	
	static void areaCirculo() { //Área de un círculo
		
		System.out.println("Introduce el radio del círculo: ");
		double radio = pedirNumero(0, 1000000);
		
		double resultado = Math.PI * (radio * radio); //Indicamos que primero hay que sacar el radio al cuadrado y luego utilizamos math.pi para el valor pi
		System.out.println("El área del círculo es: "+resultado);
	}
	
	static void senCosTan() { //Seno, Coseno y Tangente del valor X
		
		System.out.println("Introduce un valor X: ");
		double X = pedirNumero(-360, 360);
		
		double seno = Math.sin(X);
		double coseno = Math.cos(X);
		double tangente = Math.tan(X); //Etiquetas para sacar directamente los resultado
		
		System.out.println("El seno de X es: " +seno);
		System.out.println("El coseno de X es: " +coseno);
		System.out.println("La tangente de X es: " +tangente);
	}
	
	
	public static void main(String[] args) { //Diseño top-down

		int opcion = 0;
		
		while (opcion != 9) { //Indicamos que vuelva a mostrarse el menú siempre que no presione 9
			menu();
			opcion = pedirNumeroEntero(1, 9); //Indicamos que solo puede escribir un valor del 1 al 9
			
			switch (opcion) { //Switch para dividir los casos
			case 1:
				suma();
				break;
				
			case 2:
				resta();
				break;
				
			case 3:
				multiplicacion();
				break;
				
			case 4:
				division();
				break;
				
			case 5:
				areaRect();
				break;
				
			case 6:
				areaEquilatero();
				break;
				
			case 7:
				areaCirculo();
				break;
				
			case 8:
				senCosTan();
				break;
			}
		}
		System.out.println("Has salido de la calculadora."); //Mensaje informativo
	}
}
