package Aufgabe2.teil1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Person {

	private Integer id = 0;
	private Integer gewicht = 75;
	private Integer laune = 8;
	private Integer gesundheit = 90;
	private String vorname = "";
	private String name = "";
	private Datum geburtsdatum;
	private Boolean lebend = true;
	private Adresse anschrift;
	private Datum wohnortSeit;
	private final HashMap<Datum, Adresse> adressHistorie = new HashMap<>();
	private final Person[] eltern = new Person[2];
	private final Person[] grosseltern = new Person[4];
	private final ArrayList<Person> kinder = new ArrayList<>();
	
	
	public Person(final Integer id, final Integer gewicht, final Integer laune, final Integer gesundheit, final String vorname, final String name, final Datum geburtsdatum, final Boolean lebend, final Adresse anschrift, final Datum wohnortSeit) {
		this.setId(id).setGewicht(gewicht).setLaune(laune).setGesundheit(gesundheit).setVorname(vorname).setName(name).setGeburtsdatum(geburtsdatum).setLebend(lebend).setAnschrift(anschrift, wohnortSeit);
	}

	public Person(final Integer id, final Integer gewicht, final Integer laune, final Integer gesundheit, final String vorname, final String name, final Datum geburtsdatum, final Boolean lebend) {
		this.setId(id).setGewicht(gewicht).setLaune(laune).setGesundheit(gesundheit).setVorname(vorname).setName(name).setGeburtsdatum(geburtsdatum).setLebend(lebend);
	}

	public Person(final Person person) {
		this.setId(getId() + 10000).setGewicht(person.getGewicht()).setLaune(person.getLaune()).setGesundheit(person.getGesundheit()).setVorname(person.getVorname()).setName(person.getName()).setGeburtsdatum(person.getGeburtsdatum()).setLebend(person.getLebend()).setAnschrift(person.getAnschrift(), person.getWohnortSeit());
	}
	
	public Person setEltern(final Person vater, final Person mutter) {
		eltern[0] = vater;
		eltern[1] = mutter;
		return this;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return  Objects.equals(getVorname(), person.getVorname()) && Objects.equals(getName(), person.getName()) && Objects.equals(getGeburtsdatum(), person.getGeburtsdatum()) && Objects.equals(getLebend(), person.getLebend());
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(getId(), getGewicht(), getLaune(), getGesundheit(), getVorname(), getName(), getGeburtsdatum(), getLebend(), getAnschrift(), getWohnortSeit(), getAdressHistorie(), getKinder());
		result = 31 * result + Arrays.hashCode(getEltern());
		result = 31 * result + Arrays.hashCode(getGrosseltern());
		return result;
	}

	public ArrayList<Person> getEnkel() {
		ArrayList<Person> enkel = new ArrayList<>();
		if (getKinder().size() > 0) {
			for(Person kind : getKinder()) {
				enkel.addAll(kind.getKinder());
			}
		}
		return enkel;
	}


	public Person move(final Datum d, final Adresse a) {
		addAddressToHistory(a, d);
		return this;
	}

	public HashMap<Datum, Adresse> getAdressHistorie() {
		return adressHistorie;
	}

	private Person addAddressToHistory(final Adresse adresse, final Datum datum) {
		adressHistorie.put(datum, adresse);
		return this;
	}

	@Override
	public String toString() {
		return getVorname() + " " + getName() + ", " + getGeburtsdatum().toString() + ", " + getAnschrift().toString();
	}

	public Person[] getEltern() {
		return eltern;
	}
	
	public Person setGrosseltern(final Person grossvaterVater, final Person grossmutterVater, final Person grossvaterMutter, final Person grossmutterMutter) {
		grosseltern[0] = grossvaterVater;
		grosseltern[1] = grossmutterVater;
		grosseltern[2] = grossvaterMutter;
		grosseltern[3] = grossmutterMutter;
		return this;
	}
	
	public Person[] getGrosseltern() {
		return grosseltern;
	}
	
	public Person addKind(final Person kind) {
		kinder.add(kind);
		return this;
	}

	public String kinderToString() {
		String res = "Kinder:\n";
		int i = 1;
		for (Person p: kinder) {

			res = res.concat(i + ". " + p.getVorname() + " " + p.getName());
			i++;
		}
		return res;
	}
	
	public ArrayList<Person> getKinder() {
		return kinder;
	}

	
	public Datum getGeburtsdatum() {
		return geburtsdatum;
	}

	public Person setGeburtsdatum(final Datum geburtsdatum) {

			this.geburtsdatum = geburtsdatum;

		return this;
		
	}

	public Boolean getLebend() {
		return lebend;
	}

	public Person sterben() {
		return setLebend(false);
	}

	private Person setLebend(final Boolean lebend) {
		this.lebend = lebend;
		return this;
	}

	public Adresse getAnschrift() {
		return anschrift;
	}

	public Person setAnschrift(final Adresse anschrift, final Datum wohnortSeit) {
		this.anschrift = anschrift;
		setWohnortSeit(wohnortSeit);
		return this;
	}

	public Datum getWohnortSeit() {
		return wohnortSeit;
	}

	private Person setWohnortSeit(final Datum wohnortSeit) {
		this.wohnortSeit = wohnortSeit;
		return this;
	}

	private Person setId(final Integer id) {
		this.id = id;
		return this;
	}

	public Integer getId() {
		return id;
	}

	private Person setName(final String name) {
		this.name = name;
		return this;
	}

	private Person setVorname(final String vorname) {
		this.vorname = vorname;
		return this;
	}

	public Person() {
	}

	public void konsumiereLieblingsNahrungsmittel() {
		setLaune(getLaune() + 2);
		setGesundheit(getGesundheit() + 3);
		setGewicht(getGewicht() + 3);
	}

	public void konsumiereUngesundesNahrungsmittel() {
		setLaune(getLaune() - 3);
		setGesundheit(getGesundheit() - 5);
		setGewicht(getGewicht() + 3);
	}

	public void konsumiereUnbeliebtesUndGesundesNahrungsmittel() {
		setLaune(getLaune() - 5);
		setGesundheit(getGesundheit() + 5);
	}

	public String getVorname() {
		return vorname;
	}

	public String getName() {
		return name;
	}

	public Person setLaune(final Integer neuerWert) {
		laune = neuerWert;
		if (laune > 10) {
			laune = 10;
		} else if (laune < 0) {
			laune = 0;
		}
		return this;

	}

	public Integer getLaune() {
		return laune;
	}

	public Person setGesundheit(final Integer neuerWert) {
		gesundheit = neuerWert;
		if (gesundheit > 100) {
			gesundheit = 100;
		} else if (gesundheit < 0) {
			gesundheit = 0;
		}
		return this;

	}

	public Integer getGesundheit() {
		return gesundheit;
	}

	public Person setGewicht(final Integer gewicht) {
		this.gewicht = gewicht;
		return this;
	}

	public Integer getGewicht() {
		return gewicht;
	}

}
