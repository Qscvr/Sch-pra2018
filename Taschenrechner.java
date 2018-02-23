package diycalculator;



public class Taschenrechner {
// Ergebnis wird deklariert.
    double ergebnis;
    
  //Dies ist ein Konstruktor der Taschenrechner erstellen kann.
    public Taschenrechner() {
    	//Ergebnis wird ein Wert zugeordnet.
        ergebnis = 0;
    }
    //Hierbei handelt es sich um Rechenoperationen, in denen dem Programm
    //der Rechenweg beigebrecht wird.
    public void addieren(double x) {
    	//Auf Ergebnis wird der Wert von x addiert.
        ergebnis += x;
    }

    public void subtrahieren(double x) {
        ergebnis -= x;
    }
    
    public void multiplizieren(double x) {
    	ergebnis *= x;
    }
    
    public void potenzieren(double e) {
        ergebnis = (double) Math.pow(ergebnis, e);
    }

    public void dividieren(double x) {
    	  ergebnis /= x;
    }

    public void wurzeln(double b) {
        ergebnis = (double) Math.pow(ergebnis, 1 / b);
    }

    public void setErgebnis(double ergebnis) {
        this.ergebnis = ergebnis;
    }

    public double getErgebnis() {
        return ergebnis;
    }
}
