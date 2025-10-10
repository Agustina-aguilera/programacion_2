
public class Gallina {
    
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void mostrarDatos(){
        System.out.println("Id Gallina: "+idGallina+"\n "+"edad: "+edad+" "+"\n Huevos puestos:" + huevosPuestos);
    }

    public void setIdGallina(int id) {
        if (id > 0) {
        this.idGallina = id;
    }}
    
    
    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void envejecer(int anio) {
        if (anio >0) {
        edad += anio;
        }
    }
    
    public void ponerHuevos(int huevos) {
        if (huevos > 0) {
        huevosPuestos += huevos;
        }
    }
    
    
}