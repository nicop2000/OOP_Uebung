package Aufgabe2.teil2;

public class Motor {

    Integer hubraum;
    Integer zyliner;
    Integer leistung;
    String treibstoff;
    Integer gewicht;

    public Integer getHubraum() {
        return hubraum;
    }

    public Motor setHubraum(Integer hubraum) {
        this.hubraum = hubraum;
        return this;
    }

    public Integer getZyliner() {
        return zyliner;
    }

    public Motor setZyliner(Integer zyliner) {
        this.zyliner = zyliner;
        return this;
    }

    public Integer getLeistung() {
        return leistung;
    }

    public Motor setLeistung(Integer leistung) {
        this.leistung = leistung;
        return this;
    }

    public String getTreibstoff() {
        return treibstoff;
    }

    public Motor setTreibstoff(String treibstoff) {
        this.treibstoff = treibstoff;
        return this;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public Motor setGewicht(Integer gewicht) {
        this.gewicht = gewicht;
        return this;
    }
}
