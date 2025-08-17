// Punto 3


import java.util.Scanner;


public class Variables {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese edad: ");
        int edad = Integer.parseInt(input.nextLine());
        System.out.println("ingrese nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("edad: "+edad);
        System.out.println("nombre: " +nombre);
    }
}
