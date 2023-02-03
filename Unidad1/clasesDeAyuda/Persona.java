package ejerciciossalon;

public class Persona{
    private String curp;
    private String nombre;
    private String telefono;
    private Fecha fecha;

    public Persona(String curp, String nombre, String telefono, Fecha fecha){
        super();
        this.curp=curp;
        this.nombre=nombre;
        this.telefono=telefono;
        this.fecha=fecha;
    }

    public String getCurp(){
        return curp;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public Fecha getFecha(){
        return fecha;
    }

    public void setCurp(String curp){
        this.curp=curp;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public void setFecha(Fecha fecha){
        this.fecha=fecha;
    }

    public String toString(){
        return "Persona [curp=" + curp + ", nombre=" + nombre + ", telefono=" + telefono + ", fecha de nacimiento=" + fecha + "]";
    }
}

