package Aufgabe2.teil2;

import java.util.Objects;

public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public Datum(final int tag, final int monat, final int jahr) {
        setJahr(jahr);
        setMonat(monat);
        setTag(tag);

    }

    @Override
    public String toString() {
        return "geb.: " + tag + "." + monat + "." + jahr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Datum)) return false;
        Datum datum = (Datum) o;
        return getTag() == datum.getTag() && getMonat() == datum.getMonat() && getJahr() == datum.getJahr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTag(), getMonat(), getJahr());
    }

    public Datum setTag(final int tag) {
        if (tag < 1) {
            this.tag = 1;
        } else if (tag > 31) {
            if (istLangerMonat()) {
                this.tag = 31;
            } else if (this.getMonat() != 2) {
                this.tag = 30;
            } else {
                if (this.istSchaltjahr()) {
                    this.tag = 29;
                } else {
                    this.tag = 28;
                }
            }
        } else if (tag > 28 && this.getMonat() == 2 && !istSchaltjahr()) {
            this.tag = 28;
        } else if (tag > 29 && this.getMonat() == 2 && istSchaltjahr()) {
            this.tag = 29;
        } else {
            this.tag = tag;
        }
        return this;
    }

    public Datum setMonat(final int monat) {
        if (monat < 1) {
            this.monat = 1;
        } else if (monat > 12) {
            this.monat = 12;
        } else {
            this.monat = monat;
        }
        return this;
    }

    public Datum setJahr(final int jahr) {
        this.jahr = jahr;
        return this;
    }

    public int getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

    public boolean istSchaltjahr() {

        if (this.getJahr() % 4 == 0) {
            if (this.getJahr() % 100 == 0) {
                return this.getJahr() % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public boolean isUltimo() {
        if (this.getMonat() == 2) {
            if (istSchaltjahr()) {
                if (this.getTag() == 29) {
                    return true;
                }
            } else {
                if (this.getTag() == 28) {
                    return true;
                }
            }
        }

        if (istLangerMonat()) {
            return this.getTag() == 31;
        } else {
            return this.getTag() == 30;
        }

    }

    public boolean istLangerMonat() {
        if (this.getMonat() <= 7) {
            return this.getMonat() % 2 == 1;
        } else {
            return this.getMonat() % 2 == 0;
        }
    }


}
