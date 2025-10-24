import java.util.ArrayList;
public class herencia_2 {

    
    public static void main(String[] args) {
        
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Rectangulo(3, 2, "Rec1"));
        figuras.add(new Circulo(2.2, "Circulo1"));
        figuras.add(new Rectangulo(4, 2, "Rec2"));
        figuras.add(new Circulo(3, "Circulo2"));
        figuras.add(new Rectangulo(5, 3, "Rec3"));

        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }
    }
}

    

