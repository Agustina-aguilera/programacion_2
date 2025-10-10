import java.util.Scanner;

public class punto_8 {

    static double PrecioBase;
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    double Descuento, Impuesto,PrecioFinal;
  
    
    System.out.println("Ingrese un precio");
        
    PrecioBase = Double.parseDouble(input.nextLine());
    
    System.out.println("Ingrese un % de impuesto");
        
    Impuesto = Double.parseDouble(input.nextLine());
   
    System.out.println("Ingrese un descuento");
        
    Descuento = Double.parseDouble(input.nextLine());
    
    
    PrecioFinal = calcularPrecioFinal(Impuesto, Descuento);
    
    System.out.println("El precio final es: " + PrecioFinal);
    
}
    


public static double calcularPrecioFinal(double Impuesto, double Descuento) {
    
     
    double PrecioFinal = PrecioBase + (PrecioBase * Impuesto/100) - (PrecioBase * Descuento/100);
        return PrecioFinal;

}
}
