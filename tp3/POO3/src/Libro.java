
public class Libro {
    
    private String autor;
    private String titulo;
    private int añoPublicacion;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion >= 0) {
        this.añoPublicacion = añoPublicacion;
    }
    }
    
    
    
}
