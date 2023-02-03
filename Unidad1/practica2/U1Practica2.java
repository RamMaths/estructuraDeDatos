import javax.swing.JOptionPane;

public class U1Practica2 {
    public static void main(String[] args) {
        //a)
        Pentagono[] vpent = new Pentagono[6];

        //b)
        for(int i=1; i<vpent.length; i+=2) {
            float lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado del pentagono " + i));
            float apotema = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el apotema del pentagono " + i));
            vpent[i] = new Pentagono(lado, apotema);
        }

        //c)
        vpent[0] = new Pentagono(3.4f, 2.9f);

        //d)
        JOptionPane.showMessageDialog(null, "Datos generales de los pentagonos");
        for(int i=0; i<vpent.length; i++) {
            if(vpent[i] != null) JOptionPane.showMessageDialog(null, "Pentagono " + i + vpent[i].toString());
        }

        //e) 
        JOptionPane.showMessageDialog(null, "Area y perímetro de los pentagonos");
        for(int i=0; i<vpent.length; i++) {
            if(vpent[i] != null) JOptionPane.showMessageDialog(null, "Pentagono " + i + "\nPerimetro: " + vpent[i].perimetro() + "\n" 
                                                                    + "Area: "+ vpent[i].area());
        }
    }
}
