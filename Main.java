package diycalculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
    	// Icon wird mit Pfad erstellt.
    	ImageIcon icon = new ImageIcon("C:\\Users\\oscar\\Documents\\Praktikum\\Praktikum\\src\\diycalculator\\calculatoricon.png");
        TJPanel jp = new TJPanel();
        JFrame jf = new JFrame();
        //Title vom Frame wird gesetzt.
        jf.setTitle("Calculator");
        //Größe
        jf.setSize(new Dimension(505, 735));
        
        jf.add(jp);
        //Sichtbarkeit
        jf.setVisible(true);
        //Zum stoppen des Programmes
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Dem Frame wird das Icon gesetzt.
        jf.setIconImage(icon.getImage());
    }

}
