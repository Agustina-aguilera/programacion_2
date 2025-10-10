
public class Mascotas {
    
    String nombre;
    String especie;
    int edad;
    
     
    
    void mostrarInfo(){
    System.out.println(nombre+" "+especie+" "+edad);
    } 
     
     
    void cumplirAnios(int anio){
        if (anio>0){
        edad += anio;
    }
    }
}
