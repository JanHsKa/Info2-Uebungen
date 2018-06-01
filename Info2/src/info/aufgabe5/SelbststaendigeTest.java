package info.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelbststaendigeTest {


	private Selbststaendige selbststaendige;
	/**
	 * Initialisiert ein Objekt fuer Testfaelle.
	 */
	@Before
	public void initializeVar() {
		selbststaendige = new Selbststaendige(10000);
	}
	
	/**
	 * Test für Konstruktor.
	 */
	@Test
	public void testSelbststaendige() {
		assertTrue(selbststaendige != null);
	}

	/**
	 * Test getTax.
	 */
	@Test
	public void testGetTax() {
		assertEquals(selbststaendige.getTax(), 1000);
	}

	/**
	 * Test getSocialTax.
	 */
	@Test
	public void testGetSocialTax() {
		assertEquals(selbststaendige.getSocialTax(), 0);
	}

}
