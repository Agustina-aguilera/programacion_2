
public class POO4 {

    
    public static void main(String[] args) {
     
        Gallina Gallina1 = new Gallina();
        Gallina Gallina2 = new Gallina();
        
        
        Gallina1.setIdGallina(1);
        Gallina1.getEdad();
        Gallina1.getHuevosPuestos();
        
        Gallina2.setIdGallina(2);
        Gallina2.getEdad();
        Gallina2.getHuevosPuestos();
        
        Gallina1.mostrarDatos();
        Gallina2.mostrarDatos();
        
        
        Gallina1.envejecer(1);
        Gallina1.ponerHuevos(2);
        Gallina2.envejecer(1);
        Gallina2.ponerHuevos(1);
        
        
        Gallina1.mostrarDatos();
        Gallina2.mostrarDatos();
        
        
        Gallina1.envejecer(1);
        Gallina1.ponerHuevos(1);
        Gallina2.envejecer(1);
        Gallina2.ponerHuevos(3);
        
        
        Gallina1.mostrarDatos();
        Gallina2.mostrarDatos();
        
        
        
    }
    
    
}
