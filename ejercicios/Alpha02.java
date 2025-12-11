package alphasolutions;

import java.util.Scanner;

public class Alpha02
{
    public static void main(String[] args) {
        
        
        int a, b;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Dime a y b: ");
        a = in.nextInt();
        b = in.nextInt();
        
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
