import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BruchTest {
	private Bruch bruch;
	private Bruch bruch2;
	
	@BeforeEach
	void bruchErzeugen() {
		bruch = new Bruch();
		bruch2 = new Bruch(1, 3);
	}
	
	@Test
	void testBruch() {
		assertEquals(bruch.getNenner(), 1);
		assertEquals(bruch.getZaehler(), 1);
	}

	@Test
	void testBruchIntInt() {
		bruch = new Bruch(2, 3);
		
		assertEquals(bruch.getZaehler(), 2);
		assertEquals(bruch.getNenner(), 3);
	}

	@Test
	void testGetZaehler() {
		assertEquals(bruch.getZaehler(), 1);
	}

	@Test
	void testGetNenner() {
		assertEquals(bruch.getNenner(), 1);
	}

	@Test
	void testSetZaehler() {
		bruch.setZaehler(4);
		
		assertEquals(bruch.getZaehler(), 4);
	}

	@Test
	void testSetNenner() {
		bruch.setNenner(4);
		
		assertEquals(bruch.getNenner(), 4);
	}

	@Test
	void testAddieren() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.addieren(1, 3);
		
		assertEquals(bruch.getZaehler(), 1);
		assertEquals(bruch.getNenner(), 1);
	}
	
	@Test
	void testAddierenObjekt() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.addieren(bruch2);
		
		assertEquals(bruch.getZaehler(), 1);
		assertEquals(bruch.getNenner(), 1);
	}

	@Test
	void testSubtrahieren() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.subtrahieren(1, 3);
		
		assertEquals(bruch.getZaehler(), 1);
		assertEquals(bruch.getNenner(), 3);
	}
	
	@Test 
	void testSubtrahierenObjekt() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.subtrahieren(bruch2);
		
		assertEquals(bruch.getZaehler(), 1);
		assertEquals(bruch.getNenner(), 3);
	}

	@Test
	void testMultiplizieren() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.multiplizieren(3, 4);
		
		assertEquals(bruch.getZaehler(), 1);
		assertEquals(bruch.getNenner(), 2);
	}
	
	@Test
	void testMultiplizierenObjekt() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.multiplizieren(bruch2);
		
		assertEquals(bruch.getZaehler(), 2);
		assertEquals(bruch.getNenner(), 9);
	}

	@Test
	void testDividieren() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.dividieren(1, 3);
		
		assertEquals(bruch.getZaehler(), 2);
		assertEquals(bruch.getNenner(), 1);
	}
	
	@Test
	void testDividierenObjekt() {
		bruch.setNenner(3);
		bruch.setZaehler(2);
		
		bruch.dividieren(bruch2);
		
		assertEquals(bruch.getZaehler(), 2);
		assertEquals(bruch.getNenner(), 1);
	}

}
