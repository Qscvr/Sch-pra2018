package taschenrechner;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CalculatorPanel extends JPanel
{
	
	private JButton display;
	private JPanel panel;
	private double result = 0;
	private String lastCommand = "=";
	private boolean start = true;
	
	public CalculatorPanel()
	{
		setLayout(new BorderLayout());
	
		JPanel panel = new JPanel();
		JButton display = new JButton("0");
		display.setEnabled(false);
		add(display, BorderLayout.NORTH);
		
		ActionListener insert = new InsertAction();
		ActionListener command = new CommandAction();
		
		panel.setLayout(new GridLayout(4, 4));
		
		addButton("7", insert);
		addButton("8", insert);
		addButton("9", insert);
		addButton("/", command);
		
		addButton("4", insert);
		addButton("5", insert);
		addButton("6", insert);
		addButton("*", command);
		
		addButton("1", insert);
		addButton("2", insert);
		addButton("3", insert);
		addButton("-", command);
		
		addButton(".", insert);
		addButton("0", insert);
		addButton("=", command);
		addButton("+", command);
		
		add(panel, BorderLayout.CENTER);
		
				
	}
	private void addButton(String label, ActionListener listener)
	{
	JButton button = new JButton(label);
	button.addActionListener(listener);
	panel.add(button);
	
	}
	
	private class InsertAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String input = event.getActionCommand();
			if (start)
			{
				display.setText("");
				start = false;
			}
			display.setText(display.getText() + input);
		}
	}
	private class CommandAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String command = event.getActionCommand();
			
			if (start)
			{
				if (command.equals("-")) {
					display.setText(command);
					start = false;
					
				}
				else
					lastCommand = command;
					
			}
			else
			{
				calculate(Double.parseDouble(display.getText()));
				lastCommand = command;
				start = true;				
			}
		}
	}
	
	public void calculate(double x)
	
	{
		if (lastCommand.equals("+")) result += x;
		else if (lastCommand.equals("-"))result -= x;
		else if (lastCommand.equals("*"))result *= x;
		else if (lastCommand.equals("/"))result /=x;
		else if (lastCommand.equals("="))result = x;
		display.setText(""+ result);
		
	}
	
}