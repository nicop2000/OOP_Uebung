package Aufgabe2.teil1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




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
		assertTrue(birthday.isBirthday());
		assertTrue(birthday.isHoliday());
		assertTrue(pfingstSo21.isPentecost());
		assertTrue(pfingstMo21.isPentecost());
		assertTrue(himmel21.isAscension());
		assertTrue(pfingstMo21.isHoliday());
		assertTrue(himmel21.isHoliday());
		assertTrue(osterSo24.isEaster());
		assertTrue(osterSo27.isEaster());
		assertTrue(pfingstSo27.isPentecost());
		assertFalse(pfingstSo27.isAscension());
		assertTrue(karfreitag21.isHoliday());
		assertFalse(karfreitag21.isAscension());
		assertTrue(pfingstSo24.isPentecost());
		assertFalse(pfingstSo24.isBirthday());
		assertTrue(pfingstMo24.isPentecost());
		
		
	}

}
