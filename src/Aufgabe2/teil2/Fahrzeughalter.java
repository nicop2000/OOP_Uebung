package Aufgabe2.teil2;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeughalter extends Person {

    List<Fahrzeug> fahrzeuge = new ArrayList<>();

    public List<Fahrzeug> getFahrzeuge() {
        return fahrzeuge;
    }

    public Fahrzeughalter addFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
        return this;
    }

    Fahrzeughalter(final String vorname, final String nachname, final Datum geburtsdatum) {
        super(vorname, nachname, geburtsdatum);
    }

    @Override
    public String toString() {
        return "Fahrzeughalter: " + getVorname() + " " + getName() + ", " + getGeburtsdatum().toString();
    }
}
