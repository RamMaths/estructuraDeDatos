package unidad2.pilas;
import unidad2.clasesDeAyuda.Articulo;

public class pilaArticulos {
    private Articulo[] p;
    private int tope;

    public pilaArticulos(){
        p = new Articulo[5];
        tope = -1;
    }
    public pilaArticulos(int n){
        p = new Articulo[n];
        tope = -1;
    }

    public int getTope() {
        return tope;
    }
    public Articulo[] getP() {
        return p;
    }

    public void setP(Articulo[] p) {
        this.p = p;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }

    public void push(Articulo nuevo){
        if(!isFull()){
            tope++;
            p[tope] = nuevo;
        }
    }
    public Articulo pop(){
        Articulo borrado = null;
        if(!isEmpty()){
            borrado = p[tope];
            p[tope] = null;
            tope--;
        }
        return borrado;
    }

    public boolean isEmpty(){
        return tope == -1;
    }
    public boolean isFull() {
        return tope == p.length -1;
    }

    public int size(){
        return tope+1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = tope; i >= 0 ; i--) {
            s.append(p[i]).append("\n");
        }
        return s.toString();
    }
}
