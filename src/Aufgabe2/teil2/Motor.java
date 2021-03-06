package Aufgabe2.teil2;

public class Motor {

    Integer hubraum;
    Integer zyliner;
    Integer leistung;
    Treibstoff treibstoff;
    Integer gewicht;

    public Motor(final Integer hubraum, final Integer zyliner, final Integer leistung, final Treibstoff treibstoff, final Integer gewicht) {
        setHubraum(hubraum).setZyliner(zyliner).setLeistung(leistung).setTreibstoff(treibstoff).setGewicht(gewicht);

    }

    public Integer getHubraum() {
        return hubraum;
    }

    public Motor setHubraum(final Integer hubraum) {
        this.hubraum = hubraum;
        return this;
    }

    public Integer getZyliner() {
        return zyliner;
    }

    public Motor setZyliner(final Integer zyliner) {
        this.zyliner = zyliner;
        return this;
    }

    public Integer getLeistung() {
        return leistung;
    }

    public Motor setLeistung(final Integer leistung) {
        this.leistung = leistung;
        return this;
    }

    public String getTreibstoff() {
        return treibstoff.toString();
    }

    public Motor setTreibstoff(final Treibstoff treibstoff) {
        this.treibstoff = treibstoff;
        return this;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public Motor setGewicht(final Integer gewicht) {
        this.gewicht = gewicht;
        return this;
    }

    @Override
    public String toString() {
        return "Motor: " + getHubraum() + "ccm, " + getZyliner() + " Zylinder, " + getLeistung() + " PS, " + "Treibstoff: " + getTreibstoff() + ", " + getGewicht() + "kg";
    }
}
