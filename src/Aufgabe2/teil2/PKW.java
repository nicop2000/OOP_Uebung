package Aufgabe2.teil2;

public class PKW extends Fahrzeug {
    public PKW(String hersteller, String modell, Integer gesamtgewicht, Integer baujahr, Integer hoechstgeschwindigkeit, Motor motor, Fahrzeughalter halter, Fahrer fahrer) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
    }

    @Override
    public String toString() {
        return "PKW" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
