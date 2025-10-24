
package herencia_3;

import java.util.ArrayList;


public class Herencia_3 {

    
    public static void main(String[] args) {
       
       ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Pedro", 500));
        empleados.add(new EmpleadoTemporal("Pablo", 500));
        empleados.add(new EmpleadoPlanta("Juana", 500));
        empleados.add(new EmpleadoTemporal("Maria", 500));
        empleados.add(new EmpleadoPlanta("Leonor", 500));

        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.getNombre());
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta permanente ");
            } else {
                System.out.println("Tipo: Temporal ");
            }
            System.out.println(emp.calcularSueldo());
        }
       
       
    }
    
}
