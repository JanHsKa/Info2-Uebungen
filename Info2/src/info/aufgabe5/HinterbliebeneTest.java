package info.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HinterbliebeneTest {

	private Hinterbliebene hinterbliebene;
	/**
	 * Initialisiert ein Objekt fuer Testfaelle.
	 */
	@Before
	public void initializeVar() {
		hinterbliebene = new Hinterbliebene(10000);
	}
	
	/**
	 * Test f�r Konstruktor.
	 */
	@Test
	public void testHinterbliebene() {
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
		assertEquals(hinterbliebene.getSocialTax(), 2800);
	}

}
