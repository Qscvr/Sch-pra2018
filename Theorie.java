

import java.util.ArrayList;

public class Theorie {

    //damit Java wei�, wo die Ausf�hrung des Programms starten soll
    //immer dieser Aufbau
    //public, weil von au�erhalb der Klasse auf sie zugegriffen wird
    //static, weil sie aufgerufen wird, ohne dass vorher ein Objekt einer Klasse gebildet wurde
    //void, weil sie keinen R�ckgabewert besitzt
    //der String Array muss drin sein, da er die vom Aufruf entgegengenommenen Kommandozeilenparameter enth�lt
    public static void main(String[] args) {

        //Verschiedene primitive Datentypen, bedeutet von ihnen werden keine Objekte erstellt
        //primitiv, da sie weder Eigenschaften(Variablen) noch F�higkeiten (Methoden) besitzen -> einfach aufgebaut
        int i; //integer f�r ganzzahlige Werte
        long l; //ganzzahlige Werte
        char c; //16bit Unicode Zeichen zB: U+0041 -> A
        float f; //Gleitkomma
        double d; //Gleitkomma
        boolean b; //true/false

        //�brigens: Hier wurden die Variablen nun deklariert.

        //Initialisierung, also das erste Zuweisen einer Variable zu einem Wert
        String x = "Hallo, ich bin ein String";
        b = true;

        //Instanziieren, immer �ber den Aufruf eines Konstruktors.
        String z = new String("Hallo, ich bin auch ein String");
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Hallo");
        strings.add("String");

        System.out.println(strings);

        //Konstruktoraufruf und Erstellung eines Objekts
        Buch buch1 = new Buch();

        //dem Objekt wird ein Autor hinzugef�gt -> der �bergabeparameter ist ein String in diesem Fall
        buch1.setAuthor("Autor");

        //Hier wird der statische String aus der Buchklasse aufgerufen
        System.out.println(Buch.statischerString);

    }
}
