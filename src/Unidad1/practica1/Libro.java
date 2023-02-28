package Unidad1.practica1;

public class Libro {
    private String titulo;
    private String autor;
    private char clasificacion;
    private float precio;
    
    //constructors
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.clasificacion = ' ';
        this.precio = 0;
    }

    public Libro(String titulo, String autor, char clasificacion, float precio) {

        this.titulo = titulo;
        this.autor = autor;
        this.clasificacion = clasificacion;
        this.precio = precio;
    }

    //getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public char getClasificacion() {
        return this.clasificacion;
    }

    public float getPrecio() {
        return this.precio;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //métodos de instancia
    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //toString method
    @Override
    public String toString() {
        return "\nTitulo: " + this.titulo 
            +  "\nAutor: " + this.autor
            +  "\nClasificacion: " + this.clasificacion
            +  "\nPrecio: $" + this.precio;
    }
}
