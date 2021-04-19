package Aufgabe2.teil2;

public class Aufgabe2_2_Main {

    public static void main(String[] args) {
        Panzer tigerpanzer = new Panzer("Porsche", "Tigerpanzer", 12539, 2020, 35, new Motor(3000, 12, 400, Treibstoff.DIESEL, 2300), new Fahrzeughalter("Carlotta", "Kornemann", new Datum(4,1,2002)), new Fahrer("Carlotta", "Kornemann", new Datum(4,1,2002)));
        System.out.println(tigerpanzer);
    }
}
