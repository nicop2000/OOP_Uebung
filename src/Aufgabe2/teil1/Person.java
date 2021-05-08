package Aufgabe2.teil1;

import java.util.ArrayList;
import java.util.HashMap;

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
	
	
	public Person(Integer id, Integer gewicht, Integer laune, Integer gesundheit, String vorname, String name, Datum geburtsdatum, Boolean lebend, Adresse anschrift, Datum wohnortSeit) {
		this.setId(id).setGewicht(gewicht).setLaune(laune).setGesundheit(gesundheit).setVorname(vorname).setName(name).setGeburtsdatum(geburtsdatum).setLebend(lebend).setAnschrift(anschrift).setWohnortSeit(wohnortSeit);
	}

	public Person(Person person) {
		this.setId(getId() + 10000).setGewicht(person.getGewicht()).setLaune(person.getLaune()).setGesundheit(person.getGesundheit()).setVorname(person.getVorname()).setName(person.getName()).setGeburtsdatum(person.getGeburtsdatum()).setLebend(person.getLebend()).setAnschrift(person.getAnschrift()).setWohnortSeit(person.getWohnortSeit());
	}
	
	public Person setEltern(Person vater, Person mutter) {
		eltern[0] = vater;
		eltern[1] = mutter;
		return this;
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


	public Person move(Datum d, Adresse a) {
		addAddressToHistory(a, d);
		return this;
	}

	public HashMap<Datum, Adresse> getAdressHistorie() {
		return adressHistorie;
	}

	private Person addAddressToHistory(Adresse adresse, Datum datum) {
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
	
	public Person setGrosseltern(Person grossvaterVater, Person grossmutterVater, Person grossvaterMutter, Person grossmutterMutter) {
		grosseltern[0] = grossvaterVater;
		grosseltern[1] = grossmutterVater;
		grosseltern[2] = grossvaterMutter;
		grosseltern[3] = grossmutterMutter;
		return this;
	}
	
	public Person[] getGrosseltern() {
		return grosseltern;
	}
	
	public Person addKind(Person kind) {
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

	public Person setGeburtsdatum(Datum geburtsdatum) {

			this.geburtsdatum = geburtsdatum;

		return this;
		
	}

	public Boolean getLebend() {
		return lebend;
	}

	public Person sterben() {
		return setLebend(false);
	}

	private Person setLebend(Boolean lebend) {
		this.lebend = lebend;
		return this;
	}

	public Adresse getAnschrift() {
		return anschrift;
	}

	public Person setAnschrift(Adresse anschrift) {
		this.anschrift = anschrift;
		return this;
	}

	public Datum getWohnortSeit() {
		return wohnortSeit;
	}

	public Person setWohnortSeit(Datum wohnortSeit) {
		this.wohnortSeit = wohnortSeit;
		return this;
	}

	private Person setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getId() {
		return id;
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

	public Person setLaune(Integer neuerWert) {
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

	public Person setGesundheit(Integer neuerWert) {
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

	public Person setGewicht(Integer gewicht) {
		this.gewicht = gewicht;
		return this;
	}

	public Integer getGewicht() {
		return gewicht;
	}

}
