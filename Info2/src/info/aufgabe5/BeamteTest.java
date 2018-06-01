package info.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BeamteTest {

private Beamte beamter;
	
	/**
	 * Initialisiert ein Objekt fuer Testfaelle.
	 */
	@Before
	public void initializeVar() {
		beamter = new Beamte(10000);
	}
	
	/**
	 * Test für Konstruktor.
	 */
	@Test
	public void testBeamte() {
		assertTrue(beamter != null);
	}

	/**
	 * Test getTax.
	 */
	@Test
	public void testGetTax() {
		assertEquals(beamter.getTax(), 1000);
	}

	/**
	 * Test getSocialTax.
	 */
	@Test
	public void testGetSocialTax() {
		assertEquals(beamter.getSocialTax(), 0);
	}

}
