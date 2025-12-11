package unidad01;

import java.util.Scanner;

public class BuclesK {

	public static void main(String[] args) {
		// Escribe un programa que pida 5 precios al usuario y muestre la suma total.
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce su precio: ");
        int precio1 = sc.nextInt();
        System.out.println("introduce su precio: ");
        int precio2 = sc.nextInt();
        System.out.println("introduce su precio: ");
        int precio3 = sc.nextInt();
        System.out.println("introduce su precio: ");
        int precio4 = sc.nextInt();
        System.out.println("introduce su precio: ");
        int precio5 = sc.nextInt();
        int suma = precio1 + precio2+precio3+precio4+precio5;
		System.out.println("La suma total de sus precios es de  : " + suma);
		sc.close();
       

	}

}
