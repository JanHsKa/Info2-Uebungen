package info.aufgabe5;

public class NurSozialAbgabe extends SteuerZahler {

	/**
	 * Allgemeiner Konstruktor.
	 * @param einkommen Einkommen der Person
	 */
	public NurSozialAbgabe(int einkommen) {
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

}
