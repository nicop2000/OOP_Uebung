package Aufgabe2.teil2;

public class Fahrzeughalter extends Person {

    Fahrzeughalter(String vorname, String nachname, Datum geburtsdatum) {
        super(vorname, nachname, geburtsdatum);
    }

    @Override
    public String toString() {
        return "Fahrzeughalter: " + getVorname() + " " + getName() + ", " + getGeburtsdatum().toString();
    }
}
