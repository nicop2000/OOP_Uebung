package Aufgabe1.teil1;
public class Aufgabe1 {
	
	public static void main(String[] args){ 
		
		Person personEmpty = new Person();
		
		Person nico = new Person(1, 100, 75, 50, "Nico", "Petersen");
		
		Person klaas = new Person(2, 80, 70, 90, "Klaas", "Pelzer");
		
		Person nicoCopy = new Person(nico);
		
		Person klaasCopy = new Person(klaas);
		
		
	}
	

}
