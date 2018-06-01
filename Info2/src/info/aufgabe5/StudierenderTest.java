package info.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudierenderTest {

	private Studierender studierender;
	/**
	 * Initialisiert ein Objekt fuer Testfaelle.
	 */
	@Before
	public void initializeVar() {
		studierender = new Studierender(10000);
	}
	
	/**
	 * Test für Konstruktor.
	 */
	@Test
	public void testStudierender() {
		assertTrue(studierender != null);
	}

	/**
	 * Test getTax.
	 */
	@Test
	public void testGetTax() {
		Studierender studierender2 = new Studierender(5000);

		assertEquals(studierender.getTax(), 1000);
		assertEquals(studierender2.getTax(), 0);
	}

	/**
	 * Test getSocialTax.
	 */
	@Test
	public void testGetSocialTax() {
		assertEquals(studierender.getSocialTax(), 0);
	}


}
