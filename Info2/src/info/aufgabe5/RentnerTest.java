package info.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentnerTest {


	private Rentner hinterbliebene;
	/**
	 * Initialisiert ein Objekt fuer Testfaelle.
	 */
	@Before
	public void initializeVar() {
		hinterbliebene = new Rentner(10000);
	}
	
	/**
	 * Test für Konstruktor.
	 */
	@Test
	public void testRentner() {
		assertTrue(hinterbliebene != null);
	}

	/**
	 * Test getTax.
	 */
	@Test
	public void testGetTax() {
		assertEquals(hinterbliebene.getTax(), 0);
	}

	/**
	 * Test getSocialTax.
	 */
	@Test
	public void testGetSocialTax() {
		assertEquals(hinterbliebene.getSocialTax(), 0);
	}

}
