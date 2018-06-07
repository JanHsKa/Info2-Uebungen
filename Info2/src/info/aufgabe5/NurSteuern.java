package info.aufgabe5;

public class NurSteuern extends SteuerZahler {

	/**
	 * Allgemeiner Konstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public NurSteuern(int einkommen) {
		super(einkommen);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gibt die zu zahlenden Sozialabgaben der Person zurueck.
	 * @return Sozialabgaben
	 */
	public int getSocialTax() {
		return 0;
	}

}
