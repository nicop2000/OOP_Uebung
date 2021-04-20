package Aufgabe2.teil2;

public class Fahrzeug {

    String hersteller;
    String modell;
    Integer gesamtgewicht;
    Integer baujahr;
    Integer hoechstgeschwindigkeit;
    Motor motor;
    Fahrzeughalter halter;
    Fahrer fahrer;

    public Fahrzeug(final String hersteller, final String modell, final Integer gesamtgewicht, final Integer baujahr, final Integer hoechstgeschwindigkeit, final Motor motor, final Fahrzeughalter halter, final Fahrer fahrer) {
        setHersteller(hersteller).setModell(modell).setGesamtgewicht(gesamtgewicht).setBaujahr(baujahr).setHoechstgeschwindigkeit(hoechstgeschwindigkeit).setMotor(motor).setHalter(halter).setFahrer(fahrer);
    }

    public String getHersteller() {
        return hersteller;
    }

    private Fahrzeug setHersteller(final String hersteller) {
        this.hersteller = hersteller;
        return this;
    }

    public String getModell() {
        return modell;
    }

    private Fahrzeug setModell(final String modell) {
        this.modell = modell;
        return this;
    }

    public Integer getGesamtgewicht() {
        return gesamtgewicht;
    }

    private Fahrzeug setGesamtgewicht(final Integer gesamtgewicht) {
        this.gesamtgewicht = gesamtgewicht;
        return this;
    }

    public Integer getBaujahr() {
        return baujahr;
    }

    private Fahrzeug setBaujahr(final Integer baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    public Integer getHoechstgeschwindigkeit() {
        return hoechstgeschwindigkeit;
    }

    private Fahrzeug setHoechstgeschwindigkeit(final Integer hoechstgeschwindigkeit) {
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
        return this;
    }

    public Motor getMotor() {
        return motor;
    }

    public Fahrzeug setMotor(final Motor motor) {
        this.motor = motor;
        return this;
    }

    public Fahrzeughalter getHalter() {
        return halter;
    }

    public Fahrzeug setHalter(final Fahrzeughalter halter) {
        this.halter = halter;
        return this;
    }

    public boolean hatHalter() {
        return getHalter() == null;
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public Fahrzeug setFahrer(final Fahrer fahrer) {
        this.fahrer = fahrer;
        return this;
    }


}
