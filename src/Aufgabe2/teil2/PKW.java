package Aufgabe2.teil2;

public class PKW extends Fahrzeug {
    public PKW(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
    }

    @Override
    public String toString() {
        return "PKW" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
