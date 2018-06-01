package info.aufgabe5;

public class SteuerZahler {
	private int einkommen;
	
	/**
	 * Allgemeiner Konstruktor.
	 * @param einkommen 
	 */
	public SteuerZahler(int einkommen) {
		this.einkommen = einkommen;
	}
	
	/**
	 * Gibt die zu zahlenden Einkommenssteuern der Person zurueck.
	 * @return Einkommenssteuer
	 */
	public int getTax() {
		return einkommen * getTaxRate() / 100;			
	}
	
	/**
	 * Gibt die zu zahlenden Sozialabgaben der Person zurueck.
	 * @return Sozialabgaben
	 */
	public int getSocialTax() {
		return einkommen * getSocialTaxRate() / 100;
	}
	
	/**
	 * 
	 * @return
	 */
	private int getTaxRate() {
		if (einkommen <= 12000) {
			return 10;
		} else if (einkommen <= 24000) {
			return 25;
		} else if (einkommen <= 50000) {
			return 30;
		} else if (einkommen <= 75000) {
			return 40;
		} else {
			return 50;
		}
		
	}
	
	private int getSocialTaxRate() {
		return 28;
	}
	
	/**
	 * Gibt das Einkommen zurueck.
	 */
	protected int getEinkommen() {
		return einkommen;
	}
}
