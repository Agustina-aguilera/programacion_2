
public class Estudiante {
    
    String Nombre;
    String Apellido;
    String Curso;
    Double Calificacion;
    
    
    void mostrarInfo(){
        System.out.println(Nombre+" "+Apellido+" "+Curso+" "+Calificacion);
    }

    void subirCalificacion(double puntos){
        if (Calificacion >= 0) {
        Calificacion += puntos;
        }
    }
    
    void bajarCalificacion(double puntos){
        if (Calificacion >=0) {
        Calificacion -= puntos;
        }
    }
    
}
