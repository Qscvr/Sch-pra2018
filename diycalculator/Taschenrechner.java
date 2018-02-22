package diycalculator;

public class Taschenrechner {

    float ergebnis, z1, z2;
    int potenz;

    public Taschenrechner() {
        ergebnis = 0F;
    }

    public void addieren(float x) {
        ergebnis += x;
    }

    public void subtrahieren(float x) {
        ergebnis -= x;
    }
    
    public void multiplizieren(float x) {
    	ergebnis *= x;
    }
    
    public void potenzieren(float e) {
        ergebnis = (float) Math.pow(ergebnis, e);
    }

    public void dividieren(float x) {
    	  ergebnis /= x;
    }

    public void wurzeln(float b) {
        ergebnis = (float) Math.pow(ergebnis, 1 / b);
    }
    
    public void CE() {
    	//ergebnis = ;
    	
    }
    public void C() {	
    //	ergebnis = 0;
    }
    public void setErgebnis(float ergebnis) {
        this.ergebnis = ergebnis;
    }

    public float getErgebnis() {
        return ergebnis;
    }
}
