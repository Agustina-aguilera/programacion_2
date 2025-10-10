import java.util.Scanner;

public class punto_10 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
    
        System.out.print("Ingrese el stock actual: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        int stockActualizado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
    
        System.out.println("El stock actualizado es: " + stockActualizado);
    }
 

    public static int actualizarStock(int stockActual, int cantidadVendida,
    int cantidadRecibida) {
    
    int NuevoStock = (stockActual - cantidadVendida) + cantidadRecibida; 
    
    return NuevoStock;
    }
}