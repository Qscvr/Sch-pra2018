package diycalculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
    	ImageIcon icon = new ImageIcon("C:\\Users\\oscar\\calculatoricon.png");
        TJPanel jp = new TJPanel();
        JFrame jf = new JFrame();
        jf.setTitle("Calculator");
        jf.setSize(new Dimension(505, 735));
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBackground(Color.black);
        jf.setForeground(Color.white);
        jf.setIconImage(icon.getImage());
    }

}
