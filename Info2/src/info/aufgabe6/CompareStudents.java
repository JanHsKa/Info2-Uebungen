package info.aufgabe6;
import java.util.Comparator;


public class CompareStudents implements Comparator<Student> {
	
	@Override
	public int compare(Student student1, Student student2) {
		
		int compareVariable = compareLastName(student1, student2);
		
		if (compareVariable == 0) {
			compareVariable = compareFirstName(student1, student2);			
		}
		
		if (compareVariable == 0) {
			compareVariable = compareMtkNumber(student1, student2);
		}
			
		return compareVariable;
	}
	
	private int compareLastName(Student student1, Student student2) {
		 return compareName(student1, student2, NameType.LASTNAME);
	}
	
	private int compareFirstName(Student student1, Student student2) {
		return compareName(student1, student2, NameType.FIRSTNAME);
	}
	
	private int compareName(Student student1, Student student2, NameType nameType) {
		String name1;
		String name2;
		
		switch (nameType) {
		case FIRSTNAME:
			name1 = student1.getFirstName();
			name2 = student2.getFirstName();
			break;
		case LASTNAME:
			name1 = student1.getLastName();
			name2 = student2.getLastName();
			break;
		default:
			name1 = "";
			name2 = "";
			break;
		}
		
		for (int i = 0; (i < name1.length()) && (i < name2.length()); i++) {
			 if (name1.charAt(i) < name2.charAt(i)) {
				 return -1;
			 } else if (name1.charAt(i) > name2.charAt(i)) {
				 return 1;
			 }
		 }
		
		return 0;
	}
	
	
	private int compareMtkNumber(Student student1, Student student2) {
		if (student1.getMatriculationNumber() < student2.getMatriculationNumber()) {
			return -1;
		} else if (student1.getMatriculationNumber() > student2.getMatriculationNumber()) {
			return 1;
		}
		
		return 0;
	}

	
}
