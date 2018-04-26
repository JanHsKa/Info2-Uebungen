package info.aufgabe6;

public class Student {

	private int matriculationNumber; 
	private String firstname; 
	private String lastname;

	/**
	 * Allgemeiner Konstruktor, der ein Studentenobjekt erzeugt.
	 * @param m Matrikelnummer
	 * @param fn Vorname
	 * @param ln Nachname
	 */
	public Student(int m, String fn, String ln) {
		matriculationNumber = m;
		firstname = fn;
		lastname = ln;
	}
	
	/**
	 * Gibt die Matrikelnummer des Studenten zurück.
	 * @return Matrikelnummer
	 */
	public int getMatriculationNumber() {
		return matriculationNumber;
	}
	
	/**
	 * Gibt den Vornamen des Studenten als String zurück.
	 * @return Vorname
	 */
	public String getFirstName() {
		return firstname;
	}
	
	/**
	 * Gibt den Nachnamen des Studenten als String zurück.
	 * @return Nachname
	 */
	public String getLastName() {
		return lastname;
	}
	
	/**
	 * Setzt die Matrikelnummer des Studenten auf den eingegebenen Wert.
	 * @param n Matrikelnummer
	 */
	public void setMatriculationNumber(int n) {
		matriculationNumber = n;
	}
	
	/**
	 * Setzt den Vornamen des Studenten auf den eingegebenen Wert.
	 * @param n Vorname
	 */
	public void setFirstName(String n) {
		firstname = n;
	}
	
	/**
	 * Setzt den Nachnamen des Studenten auf den eingegebenen Wert.
	 * @param n Nachname
	 */
	public void setLastName(String n) {
		lastname = n;
	}

}
