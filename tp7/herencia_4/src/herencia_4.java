
import java.util.ArrayList;


public class herencia_4 {

   
    public static void main(String[] args) {
    
    ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

    for (Animal A : animales) {
        System.out.println("Animal: " + A.getClass().getSimpleName());
        A.hacerSonido();
    }
}
}
   

