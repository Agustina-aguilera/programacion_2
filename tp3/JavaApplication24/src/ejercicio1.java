
public class ejercicio1 {

    
    public static void main(String[] args) {
    
    Estudiante Estudiante1= new Estudiante();
    
    Estudiante1.Nombre = "Juan";
    Estudiante1.Apellido = "Perez";
    Estudiante1.Curso = "Programacion";
    Estudiante1.Calificacion = 7.50 ;
    
    Estudiante1.mostrarInfo();
    
    Estudiante1.subirCalificacion(2);
    
    Estudiante1.mostrarInfo();
    
    Estudiante1.bajarCalificacion(1);
    
    Estudiante1.mostrarInfo();
    
    
    
    }
    
}
