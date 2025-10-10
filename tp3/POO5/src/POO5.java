
public class POO5 {

    
    public static void main(String[] args) {
    NaveEspacial nave1 = new NaveEspacial();

        nave1.nombre= "nave1";
        nave1.combustible= 0;
        nave1.capacidadMaxima= 1000;
        nave1.kmRecorridos= 0;
    
    
        nave1.recargarCombustible(50);
        nave1.mostrarInfo();
        
        
        nave1.avanzar(20);

        nave1.mostrarInfo();
        
        nave1.recargarCombustible(50);
        nave1.avanzar(20);
        nave1.mostrarInfo();
        
    }
}

    

