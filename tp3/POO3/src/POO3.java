
public class POO3 {

    
    public static void main(String[] args) {
    
        Libro Libro1 = new Libro();
        
        Libro1.getAutor();
        Libro1.getAñoPublicacion();
        Libro1.getTitulo();
        
        Libro1.setAñoPublicacion(1930);
        
        int a = Libro1.getAñoPublicacion();
        
        System.out.println(a);
        
        Libro1.setAñoPublicacion(-15);
        
        int b = Libro1.getAñoPublicacion();
        
        System.out.println(b);
        
        
        
        
        
                
    }
    
}
