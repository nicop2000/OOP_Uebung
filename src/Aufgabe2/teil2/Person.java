package Aufgabe2.teil2;

public class Person {


    private String vorname;
    private String name;
    private Datum geburtsdatum;


    public Person(String vorname, String name, Datum geburtsdatum) {
        this.setVorname(vorname).setName(name).setGeburtsdatum(geburtsdatum);
    }


    public Datum getGeburtsdatum() {
        return geburtsdatum;
    }

    public Person setGeburtsdatum(Datum geburtsdatum) {
        if (this.geburtsdatum != null) {
            this.geburtsdatum = geburtsdatum;
        }
        return this;

    }


    private Person setName(String name) {
        this.name = name;
        return this;
    }

    private Person setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public Person() {
    }


    public String getVorname() {
        return vorname;
    }

    public String getName() {
        return name;
    }


}
