
public class punto12 {

    
    public static void main(String[] args) {
      
    double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    
    for (int i = 0; i < precios.length; i++) {
        double elemento = precios[i];
        System.out.println(elemento);  
    }
    
    precios[2]= 129.99;
    
    System.out.println(" "); 
    
    for (int i = 0; i < precios.length; i++) {
       double elemento = precios[i];
       System.out.println(elemento);     
        
        
    }
    
    }
}

