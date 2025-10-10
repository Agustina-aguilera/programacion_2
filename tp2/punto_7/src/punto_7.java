import java.util.Scanner;

public class punto_7 {

    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    float Nota;
    
    
   
    
    do {
        
    System.out.println("Ingrese una nota entre 0 y 10: ");
    Nota= input.nextFloat();
    
    } while (Nota < 0 || Nota > 10);
    
    System.out.println("Nota guardada correctamente");
    
      
      
    }
    
}
