
import java.util.Scanner;

public class punto_6 {
    
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int Num, Negativos = 0, Positivos = 0, Ceros = 0;


System.out.println("Ingrese 10 numeros para contar: ");


for (int i = 1; i <= 10; i++) {
Num = input.nextInt(); // leer un número en cada vuelta


if (Num < 0) {
Negativos++;
} else if (Num > 0) {
Positivos++;
} else { // si no es menor ni mayor, entonces es cero
Ceros++;
}
}


System.out.println("Cantidad de negativos: " + Negativos +"\nCantidad de positivos: " + Positivos +"\nCantidad de ceros: " + Ceros);

}
}
    
    

