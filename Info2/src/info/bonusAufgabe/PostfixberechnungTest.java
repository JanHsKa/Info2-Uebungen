package info.bonusAufgabe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostfixberechnungTest {
	private Postfixberechnung postfix;
	
	@BeforeEach
	void initPostfix() {
		postfix = new Postfixberechnung();
	}
	
	@Test
	void testPostfixberechnung() {
		assertTrue(postfix != null);
	}

	@Test
	void testPostfixBerechnen() {
		String eingabe = "15 42 18 + 61 24 - * 71 + *";
		
		assertEquals(postfix.postfixBerechnen(eingabe), 34365);
	}

}
