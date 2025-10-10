
import java.util.Scanner;


public class punto__3 {


    public static void main(String[] args) {
        int edad;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad para saber la etapa de la vida en la que esta");
        
        edad = input.nextInt();
        
        if (edad < 12) {
            System.out.println("Niño");
        } else if (12 <= edad && edad <= 17) {
            System.out.println("Adolescente");
        } else if (18 <= edad && edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");

        }
    }   
}

