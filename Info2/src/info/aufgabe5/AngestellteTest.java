package info.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AngestellteTest {

	private Angestellte angestellter;
	
	/**
	 * Initialisiert ein Objekt fuer Testfaelle.
	 */
	@Before
	public void initializeVar() {
		angestellter = new Angestellte(10000);
	}
	
	/**
	 * Test für Konstruktor.
	 */
	@Test
	public void testAngestellte() {
		assertTrue(angestellter != null);
	}

	/**
	 * Test getTax.
	 */
	@Test
	public void testGetTax() {
		Angestellte angestellter2 = new Angestellte(16000);
		assertEquals(angestellter.getTax(), 0);
		assertEquals(angestellter2.getTax(), 4000);
	}

	/**
	 * Test getSocialTax.
	 */
	@Test
	public void testGetSocialTax() {
		assertEquals(angestellter.getSocialTax(), 2800);
	}

}
