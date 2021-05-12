package Aufgabe2.teil1;

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
		return "Datum{" +
				"tag=" + tag +
				", monat=" + monat +
				", jahr=" + jahr +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (!(o instanceof Datum)) return false;
		Datum datum = (Datum) o;
		return getTag() == datum.getTag() && getMonat() == datum.getMonat() && getJahr() == datum.getJahr();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTag(), getMonat(), getJahr());
	}

	public Datum setTag(int tag) {
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
				if (this.getJahr() % 400 == 0) {
					return true;
				}
				return false;
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
			}else {
				if (this.getTag() == 28) {
					return true;
				}
			}
		}

		if (istLangerMonat()) {
			if (this.getTag() == 31)
				return true;
		} else {
			if (this.getTag() == 30)
				return true;
		}

		return false;

	}

	public boolean istLangerMonat() {
		if (this.getMonat() <= 7) {
			if (this.getMonat() % 2 == 1)
				return true;
		} else {
			if (this.getMonat() % 2 == 0)
				return true;
		}

		return false;
	}

	public boolean isHoliday() {
		switch (this.getMonat()) {
		case 1:
			if (this.getTag() == 1)
				return true;
			break;
		case 5:
			if (this.getTag() == 1)
				return true;
			break;
		case 10:
			if (this.getTag() == 3) {
				return true;
			} else if (this.getTag() == 31) {
				return true;
			}
			break;
		case 12:
			if (this.getTag() == 25) {
				return true;
			} else if (this.getTag() == 26) {
				return true;
			}
			break;

		}
		if (isBirthday())
			return true;
		if (isEaster())
			return true;
		if (isPentecost())
			return true;
		if (isAscension())
			return true;

		return false;
	}

	public boolean isBirthday() {
		if (this.getMonat() == 12)
			if (this.getTag() == 7)
				return true;
		return false;
	}

	public int[] dateOfEaster() {

		int ostertage[] = new int[2];
		
		int k = this.getJahr() / 100;
		int p = k / 3;
		int q = k / 4;

		int M = /*24*/ (15 + k - p - q) % 30;
		int N = /*5*/ (4 + k - q) % 7;

		int a = this.getJahr() % 4;
		int b = this.getJahr() % 7;
		int c = this.getJahr() % 19;
		int d = (19 * c + M) % 30;
		int e = (2 * a + 4 * b + 6 * d + N) % 7;

		int f = (c + 11 * d + 22 * e) / 451;
		
		if ((22 + d + e - 7 * f) > 31) {
			ostertage[0] = d + e - 7 * f - 9;
			ostertage[1] = 4;

		} else {
			ostertage[0] = 22 + d + e - 7 * f;
			ostertage[1] = 3;
		}
		return ostertage;
	}

	public boolean isEaster() {

		if (this.getMonat() == dateOfEaster()[1]) {
			if (this.getTag() == dateOfEaster()[0]) {
				return true;

			} else if (this.getTag() == (dateOfEaster()[0] - 2)) {
				return true;

			} else if (this.getTag() == (dateOfEaster()[0] + 1)) {
				return true;

			}
		}

		return false;
	}

	public boolean isPentecost() {
		int pfingsttage[] = dateOfEaster();
		if (pfingsttage[1] == 4) {
			pfingsttage[1] += 1;
			pfingsttage[0] += 19;

		} else {
			pfingsttage[1] += 1;
			pfingsttage[0] += 18;
			if (pfingsttage[0] > 31) {
				pfingsttage[1] += 1;
				pfingsttage[0] -= 30;
			}
		}

		if (pfingsttage[1] == this.getMonat()) {
			if (pfingsttage[0] == this.getTag() || pfingsttage[0] + 1 == this.getTag()) {
				return true;
			}
		}
		return false;
	}

	public boolean isAscension() {

		int himmelfahrt[] = dateOfEaster();
		if (himmelfahrt[1] == 4) {
			himmelfahrt[1] += 1;
			himmelfahrt[0] += 9;

		} else {
			himmelfahrt[1] += 1;
			himmelfahrt[0] += 8;
			if (himmelfahrt[0] > 30) {
				himmelfahrt[1] += 1;
				himmelfahrt[0] -= 29;
			}
		}

		if (himmelfahrt[1] == this.getMonat()) {
			if (himmelfahrt[0] == this.getTag()) {
				return true;
			}
		}
		return false;
	}

}
