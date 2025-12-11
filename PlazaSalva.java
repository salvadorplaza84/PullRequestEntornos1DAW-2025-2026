package metodos;

import java.util.Scanner;


public class Entregable03 {
	//Constantes de máximos y minimos para opciones del 5 al 8
	static  double valMin = 0;
	static  double valMax = 1000000;
	static  int angMin = -360;
	static  int angMax  = 360;

	static  Scanner sc = new Scanner(System.in); //Escaner para leer



	static void mostrarMenu() {	//Muestra por consola el menú
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Área rectángulo");
		System.out.println("6. Área triángulo");
		System.out.println("7. Área círculo");
		System.out.println("8. Seno, Coseno y Tangente");
		System.out.println("9. Salir");
	}
	 // Pide un número entero dentro de un rango y repite hasta que sea válido
    static int pedirEntero(int min, int max, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje + "del " + min + " al " + max + ": ");
            valor = sc.nextInt();
            if (valor < min || valor > max) {
                System.out.println("Fuera de rango. Intenta de nuevo.");
            }
        } while (valor < min || valor > max);
        return valor;
    }
 // Pide un número real (puede ser decimal) dentro de un rango, repitiendo hasta que sea correcto
    static double pedirDouble(double min, double max, String mensaje) {
        double valor;
        do {
            System.out.print(mensaje + "del " + min + " al " + max + ": ");
            valor = sc.nextDouble();
            if (valor < min || valor > max) {
                System.out.println("Fuera de rango. Intenta de nuevo.");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    // Pide un valor real sin rango
    static double pedirDouble(String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextDouble();
    }
	// Operaciones
	static double sumar (double a, double b) {return a + b;} //Suma dos números
	static double restar(double a, double b) { return a - b; }//Resta dos números
	static double multiplicar(double a, double b) { return a * b; }//multiplica 2 números
	static double dividir(double a, double b) { return a / b; } //Divide dos números
	
	
	static double areaCirculo(double radio) { //Area del círculo
		return Math.PI * radio * radio; // π r^2
	}
	
	static void mostrarTrigonometria(double grados) {
		double rad = Math.toRadians(grados);//Transforma grados a radianes
		double s = Math.sin(rad);
		double c = Math.cos(rad);
		System.out.println("sen(" + grados + ") = " + s);
		System.out.println("cos(" + grados + ") = " + c);
		if (Math.abs(c) < 1e-12) {
			System.out.println("tan(" + grados + ") indefinida (cos = 0)");
		} else {
			System.out.println("tan(" + grados + ") = " + Math.tan(rad));
		}
	}

	public static void main(String[] args) {
		// main con la lógica de la interacción con el usuario

		int opcion = 0; //Inicializa opción

		do { //Arranca mínimo una vez
			mostrarMenu();

			opcion = pedirEntero(1, 9, "Elige ");	

			 switch (opcion) { // Lo que hace en cada caso

             case 1: {
                 double a = pedirDouble("A");
                 double b = pedirDouble("B");
                 double r = sumar(a, b);
                 System.out.println("Resultado: " + r);
                 break;
             }

             case 2: {
                 double a = pedirDouble("A");
                 double b = pedirDouble("B");
                 double r = restar(a, b);
                 System.out.println("Resultado: " + r);
                 break;
             }

             case 3: {
                 double a = pedirDouble("A");
                 double b = pedirDouble("B");
                 double r = multiplicar(a, b);
                 System.out.println("Resultado: " + r);
                 break;
             }

             case 4: {
                 double a = pedirDouble("A");
                 double b = pedirDouble("B");
                 while (b == 0) { // Validamos que el divisor no es 0.
                     System.out.println("El divisor no puede ser 0. Intenta de nuevo.");
                     b = pedirDouble("Escribe número distinto de 0");
                 }
                 double r = dividir(a, b);
                 System.out.println("Resultado: " + r);
                 break;
             }

             case 5: {
                 double base = pedirDouble(valMin, valMax, "Base del rectángulo ");
                 double altura = pedirDouble(valMin, valMax, "Altura del rectángulo ");
                 double area = multiplicar(base, altura);
                 System.out.println("Área del rectángulo: " + area);
                 break;
             }

             case 6: {
                 double base = pedirDouble(valMin, valMax, "Base del triángulo ");
                 double altura = pedirDouble(valMin, valMax, "Altura del triángulo ");
                 double area = dividir(multiplicar(base, altura), 2.0);
                 System.out.println("Área del triángulo: " + area);
                 break;
             }

             case 7: {
                 double r = pedirDouble(valMin, valMax, "Radio del círculo ");
                 double area = areaCirculo(r);
                 System.out.println("Área del círculo: " + area);
                 break;
             }

             case 8: {
                 double x = pedirDouble(angMin, angMax, "Ángulo en grados ");
                 mostrarTrigonometria(x);
                 break;
             }

             case 9: {
                 System.out.println("Saliendo…");
                 break;
             }
         }
     } while (opcion != 9);

     sc.close();
 }

}
