
package herencia_3;


public class EmpleadoTemporal extends Empleado {
    
    private double sueldoMensual;

    public EmpleadoTemporal(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }

    
}
