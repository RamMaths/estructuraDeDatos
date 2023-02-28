package Unidad1.examen1;

public class Serie {
    private String nombre, genero;
    private int temporadas;

    public Serie(String nombre, int temporadas, String genero){
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.genero = genero;
    }

    public String getNombre(){
        return nombre;
    }
    public int getTemporadas(){
        return temporadas;
    }
    public String getGenero(){
        return genero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String toString(){
        return "Nombre: " + nombre + 
                "\nTemporadas: " + temporadas + 
                "\nGenero: " + genero;
    }
}
