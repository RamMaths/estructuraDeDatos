package Unidad1.clasesDeAyuda;

public class Empleado {

    private String nombre;
    private int departamento;
    private int horasTrabajadas;
    private double pagoPorHora;

    public Empleado(String nombre, int departamento, int horasTrabajadas, double pagoPorHora){
        super();
        this.nombre=nombre;
        this.departamento=departamento;
        this.horasTrabajadas=horasTrabajadas;
        this.pagoPorHora=pagoPorHora;
    }

    public String getNombre(){
        return nombre;
    }

    public int getDepartamento(){
        return departamento;
    }
    
    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public double getPagoPorHora(){
        return pagoPorHora;
    }

    public double getSalario(){
        return (horasTrabajadas * pagoPorHora);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDepartamento(int departamento){
        this.departamento=departamento;
    }
    
    
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }

    public void setPagoPorHora(double pagoPorHora){
        this.pagoPorHora=pagoPorHora;
    }

    @Override
    public String toString(){
        return "\n" + nombre + "\n" + departamento + "\n" + horasTrabajadas + "\n" + pagoPorHora + "\n" + getSalario();
    }

}
