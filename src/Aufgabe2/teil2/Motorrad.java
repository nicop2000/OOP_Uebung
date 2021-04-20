package Aufgabe2.teil2;

public class Motorrad extends Fahrzeug {

    private int geladeneDrogeninKG;

    public Motorrad(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer, final int drogenInKG) {
        super(hersteller, modell, gesamtgewicht, baujahr, hoechstgeschwindigkeit, motor, halter, fahrer);
        setGeladeneDrogeninKG(drogenInKG);
    }


    public int getGeladeneDrogeninKG() {
        return geladeneDrogeninKG;
    }

    public Motorrad setGeladeneDrogeninKG(final int geladeneDrogeninKG) {
        this.geladeneDrogeninKG = geladeneDrogeninKG;
        return this;
    }

    @Override
    public String toString() {
        return "Motorrad" + "\nHersteller: " + getHersteller() + "\nModell: " + getModell() + "\nGesamtgewicht: " + getGesamtgewicht() + " kg" + "\nBaujahr: " + getBaujahr() + "\nHöchstgeschwindigkeit: " + getHoechstgeschwindigkeit() + "km/h" + "\n" + getMotor().toString() + "\n" + "Geladene Drogen: " + getGeladeneDrogeninKG() + " kg\n" + getHalter().toString() + "\n" + getFahrer().toString();
    }


}
