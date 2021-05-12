package Aufgabe2.teil2;

import java.util.List;

public class LKW extends Fahrzeug {

    List<String> ladung;

    public LKW(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer, final List<String> ladung) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
        setLadung(ladung);
        getHalter().addFahrzeug(this);
    }

    public List<String> getLadung() {
        return ladung;
    }

    public LKW setLadung(final List<String> ladung) {
        this.ladung = ladung;
        return this;
    }

    @Override
    public String toString() {
        return "LKW" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
