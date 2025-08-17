// Punto 5



import java.util.Scanner;


public class Numeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numA, numB, suma, resta, multiplicacion;
        double division;
        
        System.out.print("Ingrese un numero entero: ");
        numA = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        numB= Integer.parseInt(input.nextLine());
        
        suma = numA + numB;
        resta = numA - numB;
        multiplicacion = numA * numB;
        division = numA / numB;
        
        System.out.println("La suma de ambos numeros es " + suma);
        System.out.println("La resta de ambos numeros es " + resta);
        System.out.println("La multiplicacion de ambos numeros es "+ multiplicacion);
        System.out.println("La division de ambos numeros es "+ division);
       
    } 
}
