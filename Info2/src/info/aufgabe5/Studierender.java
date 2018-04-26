package info.aufgabe5;

public class Studierender extends SteuerZahler {
	
	/**
	 * Standardkonstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public Studierender(int einkommen) {
		super(einkommen);
	}
	
	private static int getTaxThreshold() {
		return (int) 6000;
	}
}
