package Aufgabe2.teil2;

public class Fahrzeughalter extends Person {

    Fahrzeughalter(final String vorname, final String nachname, final Datum geburtsdatum) {
        super(vorname, nachname, geburtsdatum);
    }

    @Override
    public String toString() {
        return "Fahrzeughalter: " + getVorname() + " " + getName() + ", " + getGeburtsdatum().toString();
    }
}
