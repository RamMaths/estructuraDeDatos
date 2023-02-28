package Unidad1.practica1;

public class AppPractica1 {
    public static void main(String[] args) {
        Libro lib1, lib2;
        lib1 = new Libro();
        lib2 = new Libro("El principito", "Antonio", 'A', 345.0f);

        System.out.println(lib1.toString() + "\n" + lib2.toString());
    }
}
