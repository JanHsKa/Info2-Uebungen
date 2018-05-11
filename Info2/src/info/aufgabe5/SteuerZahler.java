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
		if (einkommen <= getTaxThreshold()) {
			return 0;			
		} else {
			return einkommen * getSteuerSatz() / 100;			
		}
	}
	
	/**
	 * Gibt die zu zahlenden Sozialabgaben der Person zurueck.
	 * @return Sozialabgaben
	 */
	public int getSocialTax() {
		if (hasToPaySocialTax()) {
			return einkommen * getSozialAbgabeSatz() / 100;
		} else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private int getSteuerSatz() {
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
	
	private static int getSozialAbgabeSatz() {
		return 28;
	}
	
	private static int getTaxThreshold() {
		return 0;
	}
	
	private static boolean hasToPaySocialTax() {
		return true;
	}
}
