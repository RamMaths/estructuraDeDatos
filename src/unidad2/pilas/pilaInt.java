package unidad2.pilas;

public class pilaInt {
    private int[] p;
    private int tope;

    public pilaInt(){
        p = new int[5];
        tope = -1;
    }
    public pilaInt(int n){
        p = new int[n];
        tope = -1;
    }

    public int[] getP() {
        return p;
    }
    public void setP(int[] p) {
        this.p = p;
    }
    public int getTope() {
        return tope;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }

    public void push(int nuevo){
        if(!isFull()){
            tope++;
            p[tope] = nuevo;
        }
    }
    public int pop(){
        int borrado = -99999;
        if(!isEmpty()){
            borrado = p[tope];
            p[tope] = 0;
            tope--;
        }
        return borrado;
    }
    public boolean isFull(){
        return tope == p.length - 1;
    }
    public boolean isEmpty(){
        return tope == -1;
    }
    public int size(){
        return tope+1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = tope; i >= 0; i--) {
            s.append(p[i]).append("\n");
        }
        return s.toString();
    }
}
