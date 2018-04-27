package info.aufgabe6;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse für Student.
 * @author jancm
 *
 */
public class StudentTest {

	private Student student;
	
	@BeforeEach
	void createStudent() {
		student = new Student(62855, "Jan", "Malle");
	}
	
	@Test
	void testStudent() {
		assertTrue(student != null);
	}

	@Test
	void testGetMatriculationNumber() {
		assertEquals(student.getMatriculationNumber(), 62855);
	}

	@Test
	void testGetFirstName() {
		assertEquals(student.getFirstName(), "Jan");
	}

	@Test
	void testGetLastName() {
		assertEquals(student.getLastName(), "Malle");
	}

	@Test
	void testSetMatriculationNumber() {
		student.setMatriculationNumber(12345);
		
		assertEquals(student.getMatriculationNumber(), 12345);
	}

	@Test
	void testSetFirstName() {
		student.setFirstName("Max");
		
		assertEquals(student.getFirstName(), "Max");
	}

	@Test
	void testSetLastName() {
		student.setLastName("Mustermann");
		
		assertEquals(student.getLastName(), "Mustermann");
	}

}
