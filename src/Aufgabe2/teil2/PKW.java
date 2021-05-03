package Aufgabe2.teil2;

public class PKW extends Fahrzeug {

    private boolean tuev;
    public PKW(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer, final boolean tuev) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
        this.setTuev(tuev);
    }

    public boolean hatTuev() {
        return tuev;
    }

    public PKW setTuev(boolean tuev) {
        this.tuev = tuev;
        return this;
    }

    @Override
    public String toString() {
        return "PKW" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
