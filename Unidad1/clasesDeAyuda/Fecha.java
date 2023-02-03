package ejerciciossalon;

public class Fecha {

    private int anio;
    private short dia;
    private byte mes;

    public Fecha(int anio, short dia, byte mes){
        super();
        this.anio = anio;
        this.dia = dia;
        this.mes = mes;
    }

    public int getAnio(){
        return anio;
    }

    public short getDia(){
        return dia;
    }

    public byte getMes(){
        return mes;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setDia(short dia){
        this.dia = dia;
    }

    public void setMes(byte mes){
        this.mes = mes;
    }

    @Override
    public String toString(){
        return "Fecha [" + dia + ", " + mes + ", " + anio + "]";
    }

}
