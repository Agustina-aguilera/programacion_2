import java.util.Scanner;
public class punto_11 {

    static double descuento = 0.10;
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ingrese un precio: ");
    double precio = Double.parseDouble(input.nextLine());
    
    double precioFinal =  calcularDescuentoEspecial(precio);
    
    System.out.print("El precio con descuento es de : "+ precioFinal);
    
    }
    
    public static double calcularDescuentoEspecial(double precio) {

    double descuentoAplicado = precio - (precio * descuento);
    
    return descuentoAplicado;
}
}
