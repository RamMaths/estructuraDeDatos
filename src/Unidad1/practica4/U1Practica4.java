package Unidad1.practica4;

import javax.swing.JOptionPane;

public class U1Practica4 {
    public static void main(String[] args) {
        Articulo abarrotes[] = new Articulo[10];

        String menu = "1.Captura de un articulo" + 
                        "\n2.Mostrar datos de un articulo" + 
                        "\n3.Total de intercambio" + 
                        "\n4.Aumentar 7% a todos los articulos" + 
                        "\n5.Salir";
        String descripcion;
        float precio, total = 0f, suma = 0f;
        int opcion = 0, posicion, cantidad;

        while(opcion != 5){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            if(opcion != 5){
                switch(opcion){
                    case 1:
                        descripcion = JOptionPane.showInputDialog(null, "Descripcion del articulo: ");
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad del articulo: "));
                        precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Precio:"));
                        posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion del articulo"));
                        if(abarrotes[posicion] == null && posicion < abarrotes.length && posicion > 0){
                            abarrotes[posicion] = new Articulo(descripcion, cantidad, precio);
                        } else{
                            JOptionPane.showMessageDialog(null, "Ocurrio un error \nIntetelo de nuevo");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < abarrotes.length; i++)
                            if(abarrotes[i] != null)
                                JOptionPane.showMessageDialog(null, "Articulo " + (i+1) + "\n" + abarrotes[i].toString());
                        break;
                    case 3:
                        for (int i = 0; i < abarrotes.length; i++) {
                            if(abarrotes[i] != null)
                            total = abarrotes[i].getPrecio() * abarrotes[i].getCantidad();
                            suma += total;
                        }
                        JOptionPane.showMessageDialog(null, "Total de inventario: \n" + suma);
                        break;
                    case 4: 
                        for (int i = 0; i < abarrotes.length; i++) {
                            if(abarrotes[i] != null){
                                abarrotes[i].setPrecio(abarrotes[i].getPrecio() + (abarrotes[i].getPrecio() * .7f ));
                            }
                        }
                        break;
                }
            }
        }
    }
}
