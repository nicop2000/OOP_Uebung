package Aufgabe2.teil1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import de.petersen.nico.datum.*;

class DatumTest {

	@Test
	void test() {
		
		Datum tagZuKlein = new Datum (-1, 3, 2020);
		Datum monatZuKlein = new Datum (21, -3, 2020);
		Datum zuGrossFebruar = new Datum (29, 2, 2021);
		Datum schaltjahr = new Datum (29, 2, 2020);
		Datum birthday = new Datum (7, 12, 2021);
		Datum karfreitag21 = new Datum (2, 4, 2021);
		Datum pfingstSo21 = new Datum(23, 5, 2021);
		Datum pfingstMo21 = new Datum(24, 5, 2021);
		Datum himmel21 = new Datum(13, 5, 2021);
		Datum pfingstSo24 = new Datum(19, 5, 2024);
		Datum pfingstMo24 = new Datum(20, 5, 2024);
		Datum osterSo24 = new Datum(31, 3, 2024);
		Datum osterSo27 = new Datum(28, 3, 2027);
		Datum pfingstSo27 = new Datum(16, 5, 2027);
		
		assertEquals(1, tagZuKlein.getTag());
		assertEquals(1, monatZuKlein.getMonat());
		assertEquals(28, zuGrossFebruar.getTag());
		assertEquals(29, schaltjahr.getTag());
		assertEquals(true, birthday.isBirthday());
		assertEquals(true, birthday.isHoliday());
		assertEquals(true, pfingstSo21.isPentecost());
		assertEquals(true, pfingstMo21.isPentecost());
		assertEquals(true, himmel21.isAscension());
		assertEquals(true, pfingstMo21.isHoliday());
		assertEquals(true, himmel21.isHoliday());
		assertEquals(true, osterSo24.isEaster());
		assertEquals(true, osterSo27.isEaster());
		assertEquals(true, pfingstSo27.isPentecost());
		assertEquals(false, pfingstSo27.isAscension());
		assertEquals(true, karfreitag21.isHoliday());
		assertFalse(karfreitag21.isAscension());
		assertTrue(pfingstSo24.isPentecost());
		assertFalse(pfingstSo24.isBirthday());
		assertTrue(pfingstMo24.isPentecost());
		
		
	}

}
