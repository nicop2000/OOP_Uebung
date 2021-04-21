package Aufgabe2.teil2;

public class Aufgabe2_2_Main {

    public static void main(final String[] args) {

        Fahrzeughalter halter = new Fahrzeughalter("Carlotta", "Kornemann", new Datum(4, 1, 2002));
        Fahrer fahrer = new Fahrer("Nico", "Petersen", new Datum(7, 12, 2000), true);

        Panzer tigerpanzer = new Panzer("Porsche", "Tigerpanzer", 12539, 2020, 35, new Motor(3000, 12, 1500, Treibstoff.DIESEL, 2300), halter, fahrer);
        System.out.println(tigerpanzer);

        System.out.print("\n\n\n");

        Bus linie45 = new Bus("MAN", "Gross", 5679, 2021, 90, new Motor(2000, 8, 245, Treibstoff.KOELSCH, 1200), halter, fahrer);
        System.out.println(linie45.toString());
        System.out.print("\n");
        System.out.println("The wheels on the bus go: " + linie45.howDoTheWheelsGo());
        System.out.print("\n\n\n");


        Motorrad drogenSchmuggler = new Motorrad("Suzuki", "KSX3", 459, 2019, 170, new Motor(1246, 5, 80, Treibstoff.ELEKTRO, 200), halter, fahrer, 75);
        System.out.println(drogenSchmuggler.toString());

    }
}
