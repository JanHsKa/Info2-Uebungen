package info.aufgabe6;

import java.util.ArrayList;
import java.util.Collections;

public class CompareTest {

	/**
	 * Main Methode, die das Sortieren von Student Objekten mithilfe einer selbst
	 * geschriebenen Comparator Klasse testet.
	 * @param args args
	 */
	public static void main(String[] args) {
		ArrayList<Student> liste = new ArrayList<Student>();
		CompareStudents compStudent = new CompareStudents();
		
		liste.add(new Student(62856, "Jan", "Malle"));
		liste.add(new Student(62855, "Jan", "Malle"));
		liste.add(new Student(62857, "Daniel", "Malle"));
		liste.add(new Student(62855, "Jan", "Mosbach"));
		liste.add(new Student(58372, "Jan", "Auer"));
		
		listOutput(liste);
		
		Collections.sort(liste, compStudent);
		
		listOutput(liste);

	}
	
	private static void listOutput(ArrayList<Student> liste) {
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i).getLastName() + ", " + liste.get(i).getFirstName() + ", " + liste.get(i).getMatriculationNumber());
		}
		System.out.println();
	}

}
