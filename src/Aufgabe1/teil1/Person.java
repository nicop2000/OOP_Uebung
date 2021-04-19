package Aufgabe1.teil1;
public class Person {

	private Integer id = 0;
	private Integer gewicht = 75;
	private Integer laune = 8;
	private Integer gesundheit = 90;
	private String vorname = "";
	private String name = "";

	public Person(Integer id, Integer gewicht, Integer laune, Integer gesundheit, String vorname, String name) {
		this.setId(id).setGewicht(gewicht).setLaune(laune).setGesundheit(gesundheit).setVorname(vorname).setName(name);
	}

	public Person(Person person) {
		this.setId(getId() + 10000).setGewicht(person.getGewicht()).setLaune(person.getLaune()).setGesundheit(person.getGesundheit()).setVorname(vorname).setName(name);
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
