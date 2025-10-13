public class Empleado {

    private int id;
    public String nombre;
    public String puesto;
    private double salario= 100;
    private static int totalEmpleados;

    
  
    //Constructor 

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
    }
    
    
    
    
    //Constructor sobrecargado

    public Empleado(String nombre, String puesto) {
        ++totalEmpleados;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado() {
        ++totalEmpleados;
        this.id= totalEmpleados;
        
    }
    
   
    public double actualizarSalario (double porcentajeAumento){
        this.salario+=((porcentajeAumento*salario)/100);
        return salario;
    }
    
    public double actualizarSalario (){
        this.salario+=((20*salario)/100);
        return salario;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    
    
    
    @Override
    public String toString() {
        return "Empleado{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", puesto='" + puesto + '\'' +
            ", salario=" + salario +
            '}';
    }
    }

    
