package unidad2.practica1;
import unidad2.pilas.pilaInt;

import javax.swing.*;

public class U2Practica1 {
    public static void main(String[] args) {
        pilaInt pares = new pilaInt(4);
        pilaInt nones = new pilaInt(4);

        String menu = """
                Pilas de enteros
                1.Capturar un entero
                2.Mostrar datos en pila de pares
                3.Mostrar datos en pila de nones
                4.Eliminar de pila de pares
                5.Terminar""";
        int opcion = 0, entero;

        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            if (opcion != 5) {
                switch (opcion) {
                    case 1 -> {
                        entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Dato a apilar: "));
                        if (entero % 2 == 0) {
                            if (!pares.isFull())
                                pares.push(entero);
                            else
                                JOptionPane.showMessageDialog(null, "PILA LLENA, intento de overflow");
                        } else {
                            if (!nones.isFull())
                                nones.push(entero);
                            else
                                JOptionPane.showMessageDialog(null, "PILA LLENA, intento de overflow");
                        }
                    }
                    case 2 ->
                            JOptionPane.showMessageDialog(null, "La pila pares tiene: " + pares.size() + " elementos" +
                                    "\nLos elementos son: \n" + pares);
                    case 3 ->
                            JOptionPane.showMessageDialog(null, "La pila pares tiene: " + nones.size() + " elementos" +
                                    "\nLos elementos son: \n" + nones);
                    case 4 -> {
                        int dato = pares.pop();
                        if (dato != -99999) {
                            JOptionPane.showMessageDialog(null, "El dato eliminado es: " + dato);
                        } else
                            JOptionPane.showMessageDialog(null, "PILA VACIA, no se pueden eliminar elementos");
                    }
                }
            }
        }
    }
}
