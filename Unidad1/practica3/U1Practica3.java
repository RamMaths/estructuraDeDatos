package Unidad1.practica3;

import javax.swing.JOptionPane;

public class U1Practica3 {
    public static void main(String[] args) {
        String menu = "1.Captura de una canción" + 
                        "\n2.Mostrar datos de cancion" + 
                        "\n3Duracion total" + 
                        "\n4.Cancion de menor duracion" + 
                        "\n5.Salir";
        int opcion = 0, contar = 0;
        Cancion playlist[] = new Cancion[5]; 
        String nombre, interprete;
        float duracion;

        while(opcion != 5){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            if(opcion != 5){
                switch(opcion){
                    case 1:
                        if(contar < 5){
                            nombre = JOptionPane.showInputDialog(null, "Nombre de la cancion: ");
                            interprete = JOptionPane.showInputDialog(null, "Interprete de la cancion");
                            duracion = Float.parseFloat(JOptionPane.showInputDialog(null, "Duracion de la cancion"));
                            playlist[contar] = new Cancion(nombre, interprete, duracion);
                            contar++;
                        } else{
                            JOptionPane.showMessageDialog(null, "CANCION NO PUEDE AGRAGARSE A LA PLAYLIST");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < playlist.length; i++) {
                            if(playlist[i] != null)
                                JOptionPane.showMessageDialog(null, "Cancion " + (i+1) + "\n"
                                                                                 + playlist[i].toString());
                        }
                        break;
                    case 3:
                        float suma = 0;
                        for (int i = 0; i < playlist.length; i++) {
                            if(playlist[i] != null)
                                suma += playlist[i].getDuracion();
                        }
                        JOptionPane.showMessageDialog(null, "Duracion total: " + suma);
                        break;
                    case 4: 
                        float menor = playlist[0].getDuracion();
                        int pos = 0;
                        for (int i = 1; i < playlist.length; i++) {
                            if(playlist[i] != null){
                                if(playlist[i].getDuracion() < menor){
                                    menor = playlist[i].getDuracion();
                                    pos = i;
                                } 
                            }   
                        }
                        JOptionPane.showMessageDialog(null, "La cancion con menor duracion es: " + playlist[pos].getNombre());
                        break;
                }
            }
        }
    }
}
