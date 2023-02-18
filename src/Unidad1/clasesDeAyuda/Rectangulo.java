package Unidad1.clasesDeAyuda;



public class Rectangulo {

	private double largo;
    private double ancho;
    
    public Rectangulo(){
        super();
        largo = 25;
        ancho = 50;
    }

    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getArea(){
        return largo*ancho;
    }

    @Override
	public String toString() {
		return "largo=" + largo + ", ancho=" + ancho + ", area=" + getArea();
	}
}
