
package herencia_3;


public class EmpleadoPlanta extends Empleado {
    
    private double sueldoMensual;

    public EmpleadoPlanta(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual + 100;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }

}
    

