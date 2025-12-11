package betacorregido;

import java.util.Scanner;

// VERSIÓN CON BUCLES (MENOS EFICIENTE)
public class Beta11v1 {

    public static void main(String[] args) {

        // Variables
        int euros;
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos X
        System.out.print("Dime euros: ");
        euros = in.nextInt();
        
        if(euros %5 != 0) {
        	System.out.println("Tiene que ser multiple de 5");
        } else {
        // ¿Billetes de 500?
        while (euros >= 500) {
            euros -= 500;
            b500++;
        }
        
        // ¿Billetes de 200?
        while (euros >= 200) {
            euros -= 200;
            b200++;
        }
        
        // ¿Billetes de 100?
        while (euros >= 100) {
            euros -= 100;
            b100++;
        }
        
        // ¿Billetes de 50?
        while (euros >= 50) {
            euros -= 50;
            b50++;
        }
        
        // ¿Billetes de 20?
        while (euros >= 20) {
            euros -= 20;
            b20++;
        }
        
        // ¿Billetes de 10?
        while (euros >= 10) {
            euros -= 10;
            b10++;
        }
        
        // ¿Billetes de 5?
        while (euros >= 5) {
            euros -= 5;
            b5++;
        }

        // Mostramos billetes necesarios
        System.out.println("Para " + euros + " euros es necesario:");
        System.out.println("Billetes de 500: " + b500);
        System.out.println("Billetes de 200: " + b200);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50 : " + b50);
        System.out.println("Billetes de 20 : " + b20);
        System.out.println("Billetes de 10 : " + b10);
        System.out.println("Billetes de 5  : " + b5);
    }
}
}
