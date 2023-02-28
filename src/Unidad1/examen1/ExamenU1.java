package Unidad1.examen1;

import javax.swing.JOptionPane;

public class ExamenU1 {
    public static void main(String[] args) {
        Serie hbo[] = new Serie[10];

        String menu = "Captura una serie:" +
                        "\n1.Captura una serie" + 
                        "\n2.Mostrar datos todas las series" + 
                        "\n3.Actualizar temporadas" + 
                        "\n4.Series del genero COMEDIA" + 
                        "\n5.Salir";
        String nombre, genero, nombreBuscar;
        int temporadas, opcion = 0, posicion = 0;
        boolean buscar = false;

        while(opcion != 5){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            if(opcion != 5){
                switch(opcion){
                    case 1:
                        posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion de la serie"));
                        if(posicion < hbo.length && posicion > 0){
                            if(hbo[posicion] == null){
                                nombre = JOptionPane.showInputDialog(null, "Nombre:");
                                temporadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Temporadas"));
                                genero = JOptionPane.showInputDialog(null, "Genero:");
                                hbo[posicion] = new Serie(nombre, temporadas, genero);
                            }else {
                                JOptionPane.showMessageDialog(null, "Casilla ya ocupada por otra serie");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Casilla no existe");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < hbo.length; i++)
                            if(hbo[i] != null)
                                JOptionPane.showMessageDialog(null, "Serie " + i + "\n" + hbo[i].toString());
                        break;
                    case 3:
                        nombreBuscar = JOptionPane.showInputDialog(null, "Nombre de la serie a buscar");
                        for (int i = 0; i < hbo.length && buscar == false; i++)
                            if(hbo[i] != null){
                                if(hbo[i].getNombre().equalsIgnoreCase(nombreBuscar)){
                                    buscar = true;
                                    posicion = i;
                                }
                            } 
                        if(buscar){
                            temporadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Serie " + (posicion) + "\n" + hbo[posicion].toString() 
                                                                                                                 + "\n\nNueva cantidad de temporadas:"));
                            hbo[posicion].setTemporadas(temporadas);
                        } else {
                            JOptionPane.showMessageDialog(null, "Serie no encontrada");
                        }
                        buscar = false;
                        break;
                    case 4: 
                        for (int i = 0; i < hbo.length; i++)
                            if(hbo[i] != null && hbo[i].getGenero().equalsIgnoreCase("Comedia"))
                                JOptionPane.showMessageDialog(null, "Series de comedia\n" + hbo[i].toString());
                        break;
                }
            }
        }
    }
}
