import java.util.Scanner;

public class Punto_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int anio;
        
        
        System.out.print("Ingrese un año para saber si es biciesto: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es biciesto");
        }else {
            System.out.println("El año no es biciesto"); 
            }
            
        }
        
    }

