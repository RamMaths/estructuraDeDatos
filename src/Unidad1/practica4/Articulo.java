package Unidad1.practica4;

public class Articulo {
    private String descripcion;
    private float precio;
    private int cantidad;

    public Articulo(){

    }
    public Articulo(String descripcion, int cantidad, float precio){
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public int getCantidad(){
        return cantidad;
    }
    public float getPrecio(){
        return precio;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String toString(){
        return  "Descripcion: " + descripcion + 
                "Cantidad: " + cantidad + 
                "Precio: " + precio;
    }
}
