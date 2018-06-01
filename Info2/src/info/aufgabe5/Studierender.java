package info.aufgabe5;

public class Studierender extends OnlyTax {
	 
	/**
	 * Standardkonstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public Studierender(int einkommen) {
		super(einkommen);
	}
	
	/**
	 * Gibt die zu zahlenden Einkommenssteuern der Person zurueck.
	 * @return Einkommenssteuer
	 */
	public int getTax() {
		if (getEinkommen() <= 6000) {
			return 0;
		} else {
			return super.getTax();	
		}
	}
}
