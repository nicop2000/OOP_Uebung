package Aufgabe2.teil2;

public class Fahrer extends Person {


    Fahrer(String vorname, String nachname, Datum geburtsdatum) {
        super(vorname, nachname, geburtsdatum);
    }

    @Override
    public String toString() {
        return "Fahrer: " + getVorname() + " " + getName() + ", " + getGeburtsdatum().toString();
    }
}
