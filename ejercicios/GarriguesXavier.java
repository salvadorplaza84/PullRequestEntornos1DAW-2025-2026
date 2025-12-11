package statics;
import java.util.Scanner;
public class Calculadora02 {
	
	static Scanner sc = new Scanner(System.in);
	
	static void MostrarMenu() {
		System.out.println("======Calculadora======");
		System.out.println("1.IMC");
		System.out.println("2.Conversor moneda");
		System.out.println("3.Media aritmética notas");
		System.out.println("4.Descuentos");
		System.out.println("5.Año de nacimiento");
		System.out.println("6.");
		System.out.println("7.");
		System.out.println("8.");
		System.out.println("9.");
		System.out.println("10.");
		System.out.println("11.Salir");
		System.out.println("======Calculadora======");
		
	}
	static void imc () {
		System.out.print("Dime el peso en KG: ");
		double peso = sc.nextDouble();
		System.out.print("Dime la altura en Metros: ");
		double altura = sc.nextDouble();
		double imc = peso / (altura*altura);
		System.out.println("Tu IMC es de: " +imc);
	
		if(imc < 18.5) {
			System.out.println("Estás en bajo peso");
		}else if( imc <= 24.9) {
			System.out.println("Tienes un peso adecuado");
		}else if( imc <= 29.9) {
			System.out.println("Tienes un peso adecuado");
		}else if( imc <= 34.9) {
			System.out.println("Obesidad grado 1");
		}else if( imc <= 39.9) {
			System.out.println("Obesidad grado 2");
		}else{
			System.out.println("Obesidad grado 2");
		}
	}
	
	static void conversor () {
		System.out.println("Dime la cantidad en euros");
		double euros = sc.nextDouble();
		double dolares = euros * 1.16;
		System.out.println(euros +" euros son " +dolares +" dólares");
	}
	static void media() {
		System.out.print("Dime el numero total de notas: ");
		int notasTotales = sc.nextInt();
		double sumaTotal= 0;
		double nota;
		for(int i = 1; i<=notasTotales; i++) {
			System.out.println("Dime las notas individuales");
			nota = sc.nextDouble();
			sumaTotal+=nota;
		}
		double media = sumaTotal/notasTotales;
		System.out.println(media);
	}
	static void descuentos() {
		System.out.println("Dime el precio del producto: ");
		double precio = sc.nextDouble();
		System.out.println("Dime el % de descuento que se le puede aplicar:");
		double descuento = sc.nextDouble();
		
		double precioFinal = precio-(precio * descuento /100);
		System.out.println("El precio final es: "+precioFinal);
	}
	static void añoNacimiento() {
		int añoNacimiento;
		System.out.println("Dime tu edad actual: ");
		int edad = sc.nextInt();
		System.out.println("¿Los has cumplido ya?");
		System.out.println("1.SI");
		System.out.println("2.NO");
		int cumplidos =sc.nextInt();
		switch (cumplidos){	
		case 1:
			añoNacimiento = 2025 - edad;
			System.out.println("Usted nació en el año "+añoNacimiento);
			break;
		case 2:
			añoNacimiento = 2025 - (edad +1);
			System.out.println("Usted nació en el año "+añoNacimiento);
			break;
		}
		
	}
	static int rangoOpciones (int min, int max) {
		int opcion;
		while (true) {
			opcion = sc.nextInt();
			if (opcion >=min && opcion <= max ) {
				return opcion;
			}else {
				System.out.println("Número no válido. Introduce otro número");
			}
		}
	}
	
	public static void main(String[] args) {
	int opcion = 0;
	while (opcion !=11) {
		MostrarMenu();
		opcion = rangoOpciones(1,11);
		if(opcion == 11) {
			System.out.println("Has salido de la calculadora");
			break;
		}
		switch(opcion){
		case 1: 
			System.out.println("//Calcular IMC//");
			imc();
			break;
		case 2:
			System.out.println("//Conversion de moneda a dólar//");
			conversor();
			break;
		case 3:
			System.out.println("//Media aritmética notas//");
			media();
			break;
		case 4:
			System.out.println("//Descuentos//");
			descuentos();
			break;
		case 5:
			System.out.println("//Año Nacimiento//");
			añoNacimiento();
			break;
		}
	
	}
	}

}
