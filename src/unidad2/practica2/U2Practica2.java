package unidad2.practica2;
import unidad2.pilas.pilaString;
import javax.swing.*;

public class U2Practica2 {
    public static void main(String[] args) {
        pilaString amigos = new pilaString(10);
        String menu = """
                Pilas de Strings
                1.Capturar el nombre de un amigo
                2.Mostrar pila de amigos
                3.Eliminar un amigo
                4.Amigo en el tope de la pila
                5.Terminar""";
        int opcion = 0;
        String nombre, eliminado;

        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            if (opcion != 5) {
                switch (opcion) {
                    case 1 -> {
                        if(!amigos.isFull()){
                            nombre = JOptionPane.showInputDialog(null, "Amigo: ");
                            amigos.push(nombre);
                        }else
                            JOptionPane.showMessageDialog(null, "Pila llena");
                    }
                    case 2 ->
                        JOptionPane.showMessageDialog(null, "Hay " + amigos.size() + " amigos\n" + amigos);
                    case 3 -> {
                        eliminado = amigos.pop();
                        if(eliminado != null)
                            JOptionPane.showMessageDialog(null, eliminado + "\nYa no es amigo");
                        else
                            JOptionPane.showMessageDialog(null, "Pila vacia");
                    }
                    case 4 -> {
                        if(!amigos.isEmpty())
                            JOptionPane.showMessageDialog(null, "Ultimo amigo es " + amigos.getP()[amigos.getTope()]);
                        else
                            JOptionPane.showMessageDialog(null, "No hay amigos");
                    }
                }
            }
        }
    }
}
