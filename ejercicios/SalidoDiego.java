package unidad01;

import java.util.Scanner;

public class BucleAlpha03 {

	public static void main(String[] args) {
		// Escribe un programa que muestre los números enteros de A a B (valores que se
		// le piden al usuario) en pasos de dos. Por ejemplo, si A=5 y B=21, entonces
		// mostraría 5, 7, 9, 11… hasta 21.
		
		int numA, numB, menor, mayor;
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número:");
		numA = sc.nextInt();
		System.out.println("Dime otro número:");
		numB = sc.nextInt();
		//Averiguo el más pequeño y contador vale ese
		
		if(numA > numB) {
			menor = numB;
			mayor = numA;
		}else {
			menor = numA;
			mayor = numB;
		}
		
		
		
		while (menor<=mayor) {	
			System.out.println(menor);
			menor = menor +2;
		}
		System.out.println();
		
		
		
		sc.close();

	}

}
