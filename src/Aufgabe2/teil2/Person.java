package Aufgabe2.teil2;

public class Person {


    private String vorname;
    private String name;
    private Datum geburtsdatum;


    public Person(final String vorname, final String name, final Datum geburtsdatum) {
        this.setVorname(vorname).setName(name).setGeburtsdatum(geburtsdatum);
    }


    public Person() {
    }

    public Datum getGeburtsdatum() {
        return geburtsdatum;
    }

    public Person setGeburtsdatum(final Datum geburtsdatum) {

        this.geburtsdatum = geburtsdatum;

        return this;

    }

    public String getVorname() {
        return vorname;
    }

    private Person setVorname(final String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getName() {
        return name;
    }

    private Person setName(final String name) {
        this.name = name;
        return this;
    }


}
