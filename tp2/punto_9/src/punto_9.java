import java.util.Scanner;
public class punto_9 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    String zona;
    Double envio, peso;
    
    System.out.println("Ingrese una zona: nacional o internacional");
    
    zona = input.next();

    System.out.println("Ingrese el peso del producto: ");
    
    peso = input.nextDouble();
    
    envio = calcularCostoEnvio(peso, zona);
    
    System.out.println("El envio es de : " + envio);
        
        
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
    
    if ("nacional".equals(zona)) {
        peso= peso * 5;
        return peso;
    } else if ("internacional".equals(zona)) {
        peso = peso * 10;
        return peso;
    } else {
        
        System.out.println("No ha ingresado una opción correcta");
            return 0;
    }
    }
}



           

    
   
