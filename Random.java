package random;

import java.util.Scanner;

public class Random {
	public static void main (String[]args) {
		
	Scanner scannerVariable = new Scanner(System.in);
	Random R = new Random();
	int anzahl, zufallszahl;
	
	for (;true;) {
	
	
	
	System.out.println("Gib bitte die Anzahl an");
	anzahl = scannerVariable.nextInt();
	zufallszahl = (int)(Math.random() * anzahl)+ 1;
	System.out.println(zufallszahl);
	
	}

}
}
