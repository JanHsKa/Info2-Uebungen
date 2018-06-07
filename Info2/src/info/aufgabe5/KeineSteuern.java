package info.aufgabe5;

public class KeineSteuern extends SteuerZahler {

	/**
	 * Allgemeiner Konstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public KeineSteuern(int einkommen) {
		super(einkommen);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gibt die zu zahlenden Einkommenssteuern der Person zurueck.
	 * @return Einkommenssteuer
	 */
	public int getTax() {
		return 0;
	}
	
	/**
	 * Gibt die zu zahlenden Sozialabgaben der Person zurueck.
	 * @return Sozialabgaben
	 */
	public int getSocialTax() {
		return 0;
	}

}
