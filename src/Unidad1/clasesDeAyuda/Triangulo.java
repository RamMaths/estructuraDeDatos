package Unidad1.clasesDeAyuda;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(){
        ladoA=25;
        ladoB=25;
        ladoC=25;
    }
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
        super();
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA(){
        return ladoA;
    }

    public double getLadoB(){
        return ladoB;
    }
    
    public double getLadoC(){
        return ladoC;
    }

    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC){
        this.ladoC = ladoC;
    }

    public double getArea(){
        double p = getPerimetro();
        return (Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC)));
    }

    public double getPerimetro(){
        return (ladoA + ladoB + ladoC)/2;
    }

    /**
     *El método toString() regresa una cadena formateada
      con toda la información (atributos del objeto)
      @return la cadena con los tres lados del triángulo 
     * */
    @Override 
    public String toString(){
        return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
    }
}

