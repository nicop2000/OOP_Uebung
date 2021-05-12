package Aufgabe2.teil2;

public class Bus extends Fahrzeug {


    public Bus(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
        getHalter().addFahrzeug(this);
    }

    public String theWheelsOnTheBusGo() {
        return "Round and round, round and round";
    }

    @Override
    public String toString() {
        return "Bus" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
