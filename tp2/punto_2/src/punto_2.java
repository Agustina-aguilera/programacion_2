import java.util.Scanner;
public class punto_2 {


    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
        int numA, numB, numC;
     
        
    System.out.println("Ingrese tres numeros: ");
        numA = input.nextInt();
        numB = input.nextInt();
        numC = input.nextInt();

        int resultado = mayor(numA, numB, numC);

        System.out.println("El mayor numero es: " + resultado);
    
}

    public static int mayor(int a,int b,int c) {
        
        int numM = a; 

        if (b > numM) {
            numM = b; 
        }

        if (c > numM) {
            numM = c; 
        }

        return numM; 
    }
    }