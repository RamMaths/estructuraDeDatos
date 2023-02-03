package ejerciciossalon.Circulo;

public class Circulo {
    private double radio;

    public Circulo(){
        super();
        radio = 1.0;
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getArea(){
        return (Math.PI * (Math.pow(radio,2)));
    }

    public double getCircunferencia(){
        return (2 * Math.PI * radio);
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public String toString(){
        return "radio=" + radio + "\narea=" + getArea() + "\ncircunferencia=" + getCircunferencia();
    }
}
