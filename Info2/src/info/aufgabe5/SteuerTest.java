package info.aufgabe5;

public class SteuerTest {

	/**
	 * test.
	 * @param args args
	 */
	public static void main(String[] args) {
		Studierender student = new Studierender(0);
		
		System.out.println(student.getTax());
		
		Studierender student2 = new Studierender(7000);
		
		System.out.println(student2.getTax());
		
		SteuerZahler test = new Studierender(0);
	}

}
