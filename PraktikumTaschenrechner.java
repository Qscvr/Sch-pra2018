package taschenrechner;
import java.util.Scanner;

public class PraktikumTaschenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double zahl1, zahl2, ergebnis;
		String operator; 


		for(;true;) {
		
			Scanner scannerVariable = new Scanner(System.in);
			
			System.out.println("Wähle den Operator.");
			operator=scannerVariable.nextLine();
			System.out.println("Erste Zahl bitte.");
			zahl1=scannerVariable.nextDouble();
			System.out.println("Zweite Zahl bitte.");
			zahl2=scannerVariable.nextDouble();
		
			if(operator.equals("+")){
				System.out.println(ergebnis=zahl1+zahl2);
			}else if (operator.equals("-")) {
				System.out.println(ergebnis=zahl1-zahl2);
			}else if (operator.equals("*")) {
				System.out.println(ergebnis=zahl1*zahl2);
			}else if (operator.equals("/")) {
				System.out.println(ergebnis=zahl1/zahl2);
			}else if (operator.equals("wrzl")||operator.equals("Wrzl")) {
				System.out.println(ergebnis= Math.sqrt(zahl1));
			}else if (operator.equals("²")||operator.equals("pow")) {
				System.out.println(ergebnis= Math.pow(zahl1, 2));
			
			System.out.println("Das Ergebnis ist:" + ergebnis);
			}
		
		}
	}

}
