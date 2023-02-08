package Unidad1.practica3;

public class Cancion{
    private String nombre, interprete;
    private float duracion;

    public Cancion(){

    }
    public Cancion(String nombre, String interprete, float duracion){
        this.nombre = nombre;
        this.interprete = interprete;
        this.duracion = duracion;
    }

    public String getNombre(){
        return nombre;
    }
    public String getInterprete(){
        return interprete;
    }
    public float getDuracion(){
        return duracion;
    }

    public String setNombre(){
        return nombre;
    }
    public String setInterprete(){
        return interprete;
    }
    public float setDuracion(){
        return duracion;
    }

    public String toString(){
        return "Nombre: " + nombre + 
               "\nInterprete: " + interprete + 
               "\nDuracion: " + duracion;
    }
}