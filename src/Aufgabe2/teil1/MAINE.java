package Aufgabe2.teil1;

public class MAINE {

	public static void main(String[] args) {
		Person nico = new Person(10, 100, 70, 70, "Nico", "Petersen", new Datum(7,12,2000), true, new Adresse("Flämische Straße", 18, 24103, "Kiel"), new Datum(16,6,2020));
		Person nico2 = new Person(10, 100, 70, 70, "Nico", "Petersen", new Datum(7,12,2000), true, new Adresse("Flämische Straße", 18, 24103, "Kiel"), new Datum(16,6,2020));
		System.out.println(nico.getWohnortSeit());
		System.out.println(nico.equals(nico2));
		nico.addKind(nico);
		for(Person enkel: nico.getEnkel()) {
			System.out.println(enkel.toString());
		}
		System.out.println(nico.kinderToString());
		nico.move(new Datum(21,3,2021), new Adresse("Di-Bo-Ri", 3, 25704, "Meldorf"));
		System.out.println(nico.getAdressHistorie());
	}

}
