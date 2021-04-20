package Aufgabe2.teil2;

public class Fahrer extends Person {

    private boolean organDonor;

    Fahrer(final String vorname, final String nachname, final Datum geburtsdatum, final boolean organDonor) {
        super(vorname, nachname, geburtsdatum);
        setOrganDonor(organDonor);
    }

    public boolean isOrganDonor() {
        return organDonor;
    }

    public Fahrer setOrganDonor(final boolean organDonor) {
        this.organDonor = organDonor;
        return this;
    }

    @Override
    public String toString() {
        return "Fahrer: " + getVorname() + " " + getName() + ", " + getGeburtsdatum().toString();
    }
}
