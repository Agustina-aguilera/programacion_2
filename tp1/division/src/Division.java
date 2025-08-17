// Punto 8

import java.util.Scanner;


public class Division {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numA, numB, division;
        
        
        System.out.print("Ingrese un numero entero: ");
        numA = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        numB= Integer.parseInt(input.nextLine());
        
        division = numA / numB;
        
        
        System.out.print("El resultado de la division es: "+ division+"\n");
        
        System.out.print("Ingrese un numero entero: ");
        numA = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        numB= Integer.parseInt(input.nextLine());
        
        double valorDoubleA = numA;
        double valorDoubleB = numB;
        double valorDoubleDivision = valorDoubleA / valorDoubleB;
        
        System.out.print("El resultado de la division es: "+ valorDoubleDivision);
        
        
        
    }
    
}
