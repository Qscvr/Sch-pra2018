package diycalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PraktikumTaschenrechner {
	
	static ActionListener event;
	   String command = ((ActionEvent) event).getActionCommand();
	
	private static void addButton(String label, ActionListener listener, JPanel panel)
	   {
	      JButton button = new JButton(label);
	      button.setPreferredSize(new Dimension(50, 40));
	      button.setFont(new Font("Arial", Font.BOLD, 20));
	      button.addActionListener(listener);
	      button.setBackground(Color.black);
	      button.setForeground(Color.white);
	      button.setBorder(null);
	      panel.add(button);
	   }
	
    public void actionPerformed(ActionEvent event, JButton display)
    {
    
       String lastCommand;
       boolean start = false;


       if (start)
       {
          if (command.equals("-"))
          {
             display.setText(command);
             start = false;
          }
          else
             lastCommand = command;
       }
       else
       {
          // Berechnung ausführen
          //calculate(Double.parseDouble(display.getText()));
          lastCommand = command;
          start = true;
       }
    }
	
		


	public static void main(String[] args) {
		float zahl1, zahl2, ergebnis = 0;
		String operator;
		int exponent = 0;
		JPanel jp = new JPanel();
		Taschenrechner tr = new Taschenrechner();
		JFrame jf = new JFrame();
		JButton display = new JButton();
		JButton button = new JButton();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(new Dimension(505, 735));
		jf.setMaximumSize(new Dimension(505, 732));
	    jf.setMinimumSize(new Dimension(505, 732));
		jf.setVisible(true);
		ImageIcon icon = new ImageIcon("C:\\Users\\oscar\\Desktop\\calculatoricon.png");
		jf.setIconImage(icon.getImage());
		display.setText(""+ergebnis);
		display.setPreferredSize(new Dimension(300, 400));
		jf.setTitle("Taschenrechner");
		jp.setLayout(new GridLayout(4, 5));
		jp.add(display);
		jf.add(jp);
		button.setBorder(null);
		button.setPreferredSize(new Dimension(50, 40));
		
		addButton("CE", event, jp);
		addButton("C", event, jp);
		addButton("x²", event, jp);
		addButton("^1/2", event, jp);
		
		addButton("7", event, jp);
		addButton("8", event, jp);
		addButton("9", event, jp);
		addButton("/", event, jp);		
		
		addButton("4", event, jp);
		addButton("5", event, jp);
		addButton("6", event, jp);
		addButton("*", event, jp);
		
		addButton("1", event, jp);
		addButton("2", event, jp);
		addButton("3", event, jp);
		addButton("-", event, jp);
		
		addButton(".", event, jp);
		addButton("0", event, jp);
		addButton("=", event, jp);
		addButton("+", event, jp);
		
		jf.add(jp, BorderLayout.CENTER);
		
		for(;true;) {
		
			Scanner scannerVariable = new Scanner(System.in);
			
//		System.out.println("Wähle den Operator.");
			operator=scannerVariable.nextLine();
//			System.out.println("Erste Zahl bitte.");
			zahl1=scannerVariable.nextFloat();
//			System.out.println("Zweite Zahl bitte.");
			zahl2=scannerVariable.nextFloat();
	
			if(operator.equals("+")){
				System.out.println(tr.addition(zahl1, zahl2));
			}else if (operator.equals("-")) {
				System.out.println(tr.subtraktion(zahl1, zahl2));
			}else if (operator.equals("*")) {
				System.out.println(tr.multiplizieren(zahl1, zahl2));
			}else if (operator.equals("/")) {
				System.out.println(tr.dividieren(zahl1, zahl2));
			}else if (operator.equals("wrzl")||operator.equals("Wrzl")) {
				System.out.println(tr.wurzel(zahl1, zahl2));
			}else if (operator.equals("²")||operator.equals("pow")) {
				System.out.println(tr.potenz(zahl1, zahl2, exponent));
			
				display.setText(""+ergebnis);
			}
		
		}
	}

}
