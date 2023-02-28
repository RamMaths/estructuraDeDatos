package unidad2.pilas;

public class pilaString {
    private String[] p;
    private int tope;

    public pilaString(){
        p = new String[5];
        tope = -1;
    }
    public pilaString(int n){
        p = new String[n];
        tope = -1;
    }

    public String[] getP() {
        return p;
    }
    public void setP(String[] p) {
        this.p = p;
    }
    public int getTope() {
        return tope;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }

    public void push(String nuevo){
        if(!isFull()){
            tope++;
            p[tope] = nuevo;
        }
    }
    public String pop(){
        String borrado = null;
        if(!isEmpty()){
            borrado = p[tope];
            p[tope] = null;
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
