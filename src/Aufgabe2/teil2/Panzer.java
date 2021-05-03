package Aufgabe2.teil2;

public class Panzer extends Fahrzeug {

    String nation;

    public Panzer(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer, final String nation) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
        this.setNation(nation);
    }

    public String getNation() {
        return nation;
    }

    public Panzer setNation(String nation) {
        this.nation = nation;
        return this;
    }

    @Override
    public String toString() {
        return "Panzer" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }
}
