package info.aufgabe5;

public class Angestellte extends SteuerZahler {

	/**
	 * Allgemeiner Konstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public Angestellte(int einkommen) {
		super(einkommen);
	}
	
	private static int getTaxThreshold() {
		return (int) 12000;
	}
}
