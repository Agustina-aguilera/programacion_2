import java.util.Scanner;

public class punto_4 {

    public static void main(String[] args) {
        String Categoria;
        Float Precio;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un precio");
        
        Precio = Float.parseFloat(input.nextLine());
        
        System.out.println("Ingrese una categoria: A,B o C");
        
        Categoria = input.nextLine();
        
                
        
        if (Categoria.equalsIgnoreCase("A")) {
            System.out.println(Precio-(Precio*0.1));
        } else if (Categoria.equalsIgnoreCase("B")) {
            System.out.println(Precio-(Precio*0.15));
        } else if (Categoria.equalsIgnoreCase("C")) {
            System.out.println(Precio-(Precio*0.20));
        } else {
            System.out.println("No inserto una categoria valida.");

        }
    }   
}

