package diycalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TJPanel extends JPanel {

    private boolean start = false;
    JButton display;
    private JPanel panel;
    private String lastCommand;

    public TJPanel() {
        super();
        lastCommand = "=";
        setLayout(new BorderLayout());
        start = true;
        display = new JButton();
        display.setPreferredSize(new Dimension(60, 200));
        display.setEnabled(false);
        display.setBackground(new Color(47, 79, 79));
        display.setForeground(Color.white);
        display.setBorder(null);
        display.setFont(new Font("Arial", Font.BOLD, 30));
        add(display, BorderLayout.NORTH);
        Taschenrechner tr = new Taschenrechner();

        ActionListener il = e -> {
            String input = e.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        };

        ActionListener cl = e -> {
            String command = e.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                }
                else if (command.equals("C")) {
                	display.setText("");
                	start = false;
                }
                	
                else {
                    lastCommand = command;
                }
            }
            else {
                calculate(Float.parseFloat(display.getText()), tr);
                lastCommand = command;
              start = true;
            }
        };
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        addButton("^", cl);
        addButton("wurzeln", cl);
        addButton(" ", cl);
        addButton("C", cl);
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

        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setBorder(null);
        panel.add(button);
    }

    private void calculate(float x, Taschenrechner ta) {

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
            case "CE":
            	ta.CE();
            	display.setText("");
            case "C":
            	ta.setErgebnis(0);
            	x = 0;
            	display.setText("");
            	break;
            default:
                ta.setErgebnis(x);
                break;

        }
        display.setText("" + ta.getErgebnis());
    }
}
