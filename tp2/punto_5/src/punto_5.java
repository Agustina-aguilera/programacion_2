import java.util.Scanner;

public class punto_5 {

 
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int Num, Suma;
        
        Suma= 0;
        

        System.out.println("Ingrese un número (0 para terminar): ");
        Num = input.nextInt();

        while (Num != 0) {
            if (Num % 2 == 0) { 
                Suma += Num;
            }
            System.out.println("Ingrese un número (0 para terminar): ");
            Num = input.nextInt();
        }

        System.out.println("La suma de los números pares es: " + Suma);
    }
}
