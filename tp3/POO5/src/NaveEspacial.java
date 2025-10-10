
public class NaveEspacial {
    
String nombre; 
double combustible;
double capacidadMaxima;
double kmRecorridos;
    
public void despegar(){
    if (combustible> 0){
        System.out.println(nombre + " despega");
    } else {
        System.out.println(nombre + " no puede despegar, no tiene combustible");
    }
}

public void avanzar(double distancia) {
    if (combustible >= distancia * 5) {
        combustible -= distancia * 5;
        kmRecorridos += distancia;
        System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
    } else {
        System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
    }
}


public void recargarCombustible(double cantidad) {
        if (cantidad > 0 && cantidad <= capacidadMaxima) {
            combustible += cantidad;
            
            System.out.println("Se recargo " + cantidad + " litros de combustible");
        } else {
            System.out.println("La cantidad a recargar debe ser positiva.");
        }
    }

void mostrarInfo(){
        System.out.println("estado de la nave: " + nombre + " Tiene "+ combustible + " litros de combustible. Avanzo " + kmRecorridos);
    }
}