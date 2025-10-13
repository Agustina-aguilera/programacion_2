
public class poo_1 {

    
    public static void main(String[] args) {
       
        Empleado EmpleadoA = new Empleado (1, "Enrique", "peon", 150);
        Empleado EmpleadoB = new Empleado(); 
        Empleado EmpleadoC = new Empleado ("Juan", "recepcionista" );
        Empleado EmpleadoD = new Empleado ("Javier", "repositor" );
        
        
        
        
        System.out.println(EmpleadoA);
        System.out.println(EmpleadoB);
        System.out.println(EmpleadoC);
        System.out.println(EmpleadoD);
        System.out.println(Empleado.mostrarTotalEmpleados());
        
        Empleado EmpleadoE = new Empleado ("Flavia", "recepcionista" );
        System.out.println(EmpleadoE);
        System.out.println(Empleado.mostrarTotalEmpleados());
    
        EmpleadoA.actualizarSalario();
        EmpleadoB.actualizarSalario(30);
        System.out.println(EmpleadoA);
        System.out.println(EmpleadoB);
        
        
        
        
    }
    
    
}
