package taschenrechner;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame 

{
	CalculatorPanel panel = new CalculatorPanel();


public CalculatorFrame()
{
	
	setTitle("Calculator");
	add(panel);
	pack();
	
	
	}
}
