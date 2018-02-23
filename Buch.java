

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Eine Klasse
public class Buch {

    private String name, author, publisher, isbn;

    //private, weil auf die Attribute nicht von außen zugegriffen werden soll
    private String description;
    Date date;

    //statisch bedeutet, dass die Variable unabhängig von einem Objekt der Klasse Buch existiert. Sie kann von außen über den Klassennamen auferufen werden.
    static String statischerString = "Ich bin ein statischer String";

    //Eine getter-Methode
    public String getName() {
        return name;
    }

    //Eine setter-Methode
    //void, weil die Methode nichts zurückgibt
    public void setName(String name) {
        // direktes Setzen eines einfachen Properties
        this.name = name;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        // direktes Setzen eines einfachen Properties
        this.author = author;

    }

    public String getPublisher() {

        return publisher;
    }

    public void setPublisher(String publisher) {
        // direktes Setzen eines einfachen Properties
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String sb) {
        // direktes Setzen eines einfachen Properties
        this.description = sb;
    }

    //try-catch-Block
    public void setDateString(String date) {
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);

        //im try-Block wird gesicherter Code ausgeführt
        try {
            setDate(format.parse(date));
        }

        //hier findet die Fehlerbehandlung statt, wenn Fehler auftreten
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    //Zugriff, hier public, Datentyp der Rückgabe und Name der Methode, evtl Parameter
    @Override
    public String toString() {
        return "Book [name="
            + name
            + ", author="
            + author
            + ", publisher="
            + publisher
            + ", isbn="
            + isbn
            + ", description="
            + description
            + "]";
    }

}
