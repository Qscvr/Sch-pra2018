package diycalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
//hier haben wir eine eigene JPanelklasse die von JPanel erbt.
//wir Haben geerbt um die gleichen Funktionalitäten wie JPanel zu haben.
public class TJPanel extends JPanel {
	//Hier bringen wir dem Programm den weg zu einem Programm bei.
	private static final String NIRCMD = "C:\\Program Files\\Windows Media Player\\wmplayer.exe";
    private boolean start = false;
    private JButton display;
    private int index=0;
    private JPanel panel;
    private String lastCommand;
    //in den Zeilen 30-32 erstellen wir einen Array mit den folgenden Farben.
    private Color[] colors = new Color[] { new Color(4, 45, 62), new Color(77, 155, 166), new Color(244, 193, 39),
    		new Color (216, 125, 15), new Color(166, 51, 5), new Color(251, 216, 176), new Color(61, 80, 93), 
    		new Color(159, 58, 55), new Color(203, 89, 64), new Color(220, 135, 41)};
    // Diese Zeile stellt das Ausgabeformat des Taschnerechner ein.
    DecimalFormat df = new DecimalFormat("###,###,##0.####", DecimalFormatSymbols.getInstance(Locale.GERMAN));
    
    
//Dies ist ein Konstruktor der TJPanel erstellen kann.
    public TJPanel() {
    	// lastCommand wird ein Wert zugewiesen.
        lastCommand = "=";
        //Layout des Panels wird gesetzt.
        setLayout(new BorderLayout());
        start = true;
        //Das Display wird erstellt.
        display = new JButton();
        //Die Grösse wird bearbeitet.
        display.setPreferredSize(new Dimension(60, 200));
        display.setName("EasterEgg");
        display.setBackground(new Color(47, 79, 79));
        display.setForeground(new Color(255, 255, 255));
        display.setBorder(null);
        display.setFont(new Font("Arial", Font.BOLD, 30));
        // Dem Panel wird das Display im BorderLayout oben hinzugefügt
        add(display, BorderLayout.NORTH);
        // Dann wird ein Taschenrechner Objekt instanziiert.
        Taschenrechner tr = new Taschenrechner();
        //ActionLister für die versch. Events werden erstellt.
        //1. Für die Zahlen
        ActionListener il = e -> {
            String input = e.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        };
        //2. Für die Operatoren
        ActionListener cl = e -> {
            String command = e.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                }
             
                else if (command.equals("Color")) {
              
				if(index < (colors.length - 1))
                {index++;
                }
                else
                {
                index = 0;
                }
                display.setBackground(colors[index]);
                if (colors[index].getRed() >= 200) {
                	display.setForeground(Color.black);
                }
                else if(colors[index].getRed() < 200) {
                	display.setForeground(Color.white);
                }
                }
                	
                else {
                    lastCommand = command;
                }
            }
            else {
                calculate(Double.parseDouble(display.getText()), tr);
                lastCommand = command;
              start = true;
            }
        };
        //3. Für den Clearbutton
        ActionListener rl = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String clear = e.getActionCommand();
			
				if (clear.equals("C")) {
	                display.setText("");
	                start = false;
	                }
			}
		};
	//4. Für ein EasterEgg	
	ActionListener gl = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
		String gif = e.getActionCommand();
			
				try {
					Runtime.getRuntime().exec(new String[] {
					"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe",
					"C:\\Users\\oscar\\Documents\\Praktikum\\Praktikum\\src\\diycalculator\\Panda.mp4"
					});
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		};
		//Hier wird der ActionListener dem Display hinzugefügt.
		display.addActionListener(gl);
		//Ein neues JPanel wird erstellt.
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        // Für jeden Button des Taschenrechners wird die Methode addButton aufgerufen.
        //Es wird der passende String und ActionListener mitgegeben.
        
        addButton("^", cl);
        addButton("wurzeln", cl);
        addButton("Color", cl);
        addButton("C", rl);
        addButton("7", il);
        addButton("8", il);
        addButton("9", il);
        addButton("/", cl);

        addButton("4", il);
        addButton("5", il);
        addButton("6", il);
        addButton("*", cl);

        addButton("1", il);
        addButton("2", il);
        addButton("3", il);
        addButton("-", cl);

        addButton("0", il);
        addButton(".", il);
        addButton("=", cl);
        addButton("+", cl);
        //Das TJPanel bekommt ein JPanel.
        // Das Panel wird mittig hinzugefügt
        add(panel, BorderLayout.CENTER);
    }
    // In der addButton Methode werden die grundlegenden Einstellungen des Buttons bearbeitet.
    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setBorder(null);
        button.setFocusPainted(false);
        //Hier werden die Buttons dem Panel hinzugefügt.
        panel.add(button);
    }
    //Hier befinden sich die Methodenaufrufe zur Berechnung der Eingabe.
    private void calculate(double x, Taschenrechner ta) {

        switch (lastCommand) {
            case "+":
                ta.addieren(x);
                break;
            case "-":
                ta.subtrahieren(x);
                break;
            case "*":
            	ta.multiplizieren(x);
                break;
            case "/":
            	ta.dividieren(x);
                break;
            case "^":
                ta.potenzieren(x);
                break;
            case "wurzeln":
                ta.wurzeln(x);
                break;
            default:
                ta.setErgebnis(x);
                break;

        }//Das Ergebnis wird Auf dem Display angezeigt
        display.setText("" + df.format(ta.getErgebnis()));
    }
    
   
}
