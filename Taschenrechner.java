package diycalculator;


public class Taschenrechner {
	private float zahl1, zahl2, ergebnis;
	int exponent;
	
	
	public Taschenrechner() {}
		protected float addition(float zahl1, float zahl2) {
			return ergebnis=zahl1+zahl2;
		}
		protected float subtraktion(float zahl1, float zahl2) {
			return ergebnis=zahl1-zahl2;	
		}
		protected float multiplizieren(float zahl1, float zahl2) {
			return ergebnis=zahl1*zahl2;
		}
		protected float dividieren(float zahl1, float zahl2) {
			return ergebnis=zahl1/zahl2;
		}
		protected float wurzel(float zahl1, float zahl2) {
			return ergebnis=(float) Math.sqrt(zahl1);
		}
		protected float potenz(float zahl1,float zahl2,int exponent) {
			return ergebnis=(float) Math.pow(zahl1, exponent);
		}
		
	}

   