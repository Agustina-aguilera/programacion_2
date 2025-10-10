
public class POO2 {

   
    public static void main(String[] args) {
    
        Mascotas mascota1 = new Mascotas();
        
        mascota1.nombre= "Panchito";
        mascota1.especie= "Perro";
        mascota1.edad = 3;
        
        mascota1.mostrarInfo();
        
        mascota1.cumplirAnios(1);
        
        mascota1.mostrarInfo();
        
    }
    
}
