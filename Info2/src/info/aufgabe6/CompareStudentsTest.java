package info.aufgabe6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Testklasse für CompareStudents.
 * @author jancm
 *
 */
public class CompareStudentsTest {

	@Test
	void testCompare() {
		CompareStudents compare = new CompareStudents();
		
		Student student1 = new Student(62855, "Jan", "Malle");
		Student student2 = new Student(62856, "Jan", "Malle");
		Student student3 = new Student(62857, "Daniel", "Malle");
		Student student4 = new Student(62855, "Jan", "Mosbach");
		
		assertEquals(compare.compare(student1, student2), -1);
		assertEquals(compare.compare(student2, student1), 1);
		assertEquals(compare.compare(student2, student3), 1);
		assertEquals(compare.compare(student2, student4), -1);
		assertEquals(compare.compare(student4, student1), 1);
	}

}
