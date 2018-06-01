package info.aufgabe5;

public class Angestellte extends TaxAndSocialTax {

	/**
	 * Allgemeiner Konstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public Angestellte(int einkommen) {
		super(einkommen);
	}
	
	/**
	 * Gibt die zu zahlenden Einkommenssteuern der Person zurueck.
	 * @return Einkommenssteuer
	 */
	public int getTax() {
		if (getEinkommen() <= 12000) {
			return 0;	
		} else {
			return super.getTax();	
		}
	}
}
