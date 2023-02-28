package Unidad1.practica2;

public class Pentagono {

	private float lado;
	private float apotema;
	
	
    //constructores
    public Pentagono() {
        this.lado = 0;
        this.apotema = 0;
    }
	public Pentagono(float lado, float apotema) {
		super();
		this.lado = lado;
		this.apotema = apotema;
	}

    //getters
	public float getApotema() {
        return apotema;
	}

    public float getLado() {
        return lado;
    }

    //setters
	public void setLado(float lado) {
        this.lado = lado;
	}

	public void setApotema(float apotema) {
        this.apotema = apotema;
	}

    //métodos de instancia
    public float perimetro() {
        return lado * 5;
    }

    public float area() {
        return this.perimetro() * apotema / 2;
    }
	
    //to string
    @Override
    public String toString() {
        return "\nLado: " + lado
            +  "\nApotema: " + apotema;
    }
}
