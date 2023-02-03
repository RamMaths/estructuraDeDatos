package Persona;

public class Estudiante extends Persona {

    private String codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, String codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(String codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCodigo Estudiante: " + codigoEstudiante + "\nNota Final: " + notaFinal;
	}
}
