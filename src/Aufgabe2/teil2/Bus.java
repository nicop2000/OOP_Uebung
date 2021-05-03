package Aufgabe2.teil2;

public class Bus extends Fahrzeug {


    public Bus(String hersteller, String modell, Integer gesamtgewicht, Integer baujahr, Integer hoechstgeschwindigkeit, Motor motor, Fahrzeughalter halter, Fahrer fahrer) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
    }

    public String theWheelsOnTheBusGo() {
        return "Round and round, round and round";
    }

    @Override
    public String toString() {
        return "Bus" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
