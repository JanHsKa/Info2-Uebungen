
public class Bruch {
	private int nenner;
	private int zaehler;
	
	/**
	 * Standardkonstruktor, der den Bruch 1/1 initialisiert.
	 */
	
	public Bruch() {
		this.nenner = 1;
		this.zaehler = 1;
	}
	
	/**
	 * Allgemeiner Konstruktor, der einen Bruch mit den angegebenen Werten initialisiert.
	 * @param nenner Nenner des Bruches, darf nicht 0 sein
	 * @param zaehler Zaehler des Bruches
	 */
	
	public Bruch(int zaehler, int nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
		
		vorzeichenAnpassen();
		kuerzen();
	}
	
	private void ueberpruefeNenner() {
		if (nenner == 0) {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * @return Wert des Zaehlers
	 */
	
	public int getZaehler() {
		return zaehler;
	}
	
	/**
	 * @return Wert des Nenners
	 */
	
	public int getNenner() {
		return nenner;
	}
	
	/**
	 * @param zaehler Wert den der Zaehler annehmen soll
	 */
	
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
		
		kuerzen();
	}
	
	/**
	 * @param nenner Wert den der Nenner annehmen soll, darf nicht 0 sein
	 */
	
	public void setNenner(int nenner) {
		this.nenner = nenner;
		
		vorzeichenAnpassen();
		kuerzen();
	}
	
	/**
	 * Addiert den eingegebenen Bruch hinzu.
	 * @param nenner Nenner des zu addierenden Bruches
	 * @param zaehler Zaehler des zu addierenden Bruches
	 */
	
	public void addieren(int zaehler, int nenner) {
		Bruch summand = new Bruch(zaehler, nenner);
		
		this.zaehler = summand.getZaehler() * this.nenner + this.zaehler * summand.getNenner();
		this.nenner *= summand.getNenner();
		
		vorzeichenAnpassen();
		kuerzen();
	}
	
	/**
	 * Addiert den eingegebenen Bruch zu diesem.
	 * @param bruch Bruchobjekt, dessen Wert zu diesem addiert wird
	 */
	
	public void addieren(Bruch bruch) {
		addieren(bruch.getZaehler(), bruch.getNenner());
	}
	
	/**
	 * Subtrahiert den eingegebenen Bruch vom aktuellen Wert.
	 * @param nenner Nenner des zu Subtrahierenden Bruches
	 * @param zaehler Zaehler des zu Subtrahierenden Bruches
	 */
	
	public void subtrahieren(int zaehler, int nenner) {
		addieren((-1) * zaehler, nenner);
	}
	
	/**
	 * Subtrahiert den eingegebenen Bruch vom aktuellen Wert.
	 * @param bruch Bruchobjekt, wird vom Wert dieser Bruchklasse abgezogen
	 */
	
	public void subtrahieren(Bruch bruch) {
		subtrahieren(bruch.getZaehler(), bruch.getNenner());
	}
	
	/**
	 * Multipliziert den eingegeben Bruch mit dem aktuellen Wert.
	 * @param nenner Nenner des zu Multiplizierenden Bruches
	 * @param zaehler Zaehler des zu Multiplizierenden Bruches
	 */
	
	public void multiplizieren(int zaehler, int nenner) {
		this.nenner *= nenner;
		this.zaehler *= zaehler;
		
		vorzeichenAnpassen();
		kuerzen();
	}
	
	/**
	 *  Multipliziert den eingegeben Bruch mit dem aktuellen Wert.
	 * @param bruch Bruchobjekt dieser Bruchklasse
	 */
	
	public void multiplizieren(Bruch bruch) {
		multiplizieren(bruch.getZaehler(), bruch.getNenner());
	}
	
	/**
	 * Dividiert den aktuellen Wert des Bruches durch den eingegeben Bruch.
	 * @param nenner Nenner des Divisors
	 * @param zaehler Zaehler des Divisors
	 */
	
	public void dividieren(int zaehler, int nenner) {
		multiplizieren(nenner, zaehler);
	}
	
	/**
	 * Dividiert den aktuellen Wert des Bruches durch den eingegeben Bruch.
	 * @param bruch Bruchobjekt, durch welches geteilt wird
	 */
	public void dividieren(Bruch bruch) {
		dividieren(bruch.getZaehler(), bruch.getNenner());
	}
	
	private void kuerzen() {		
		ueberpruefeNenner();

		int ggt = ggT();
		
		this.zaehler /= ggt;
		this.nenner /= ggt;	
	}
	
	
	private int ggT() {
		int ggt = 1;
		int rest = this.nenner;
		int zaehler = this.zaehler;
		
		while (rest != 0) {
			ggt = rest;
			rest = zaehler % ggt;
			zaehler = ggt;
		}
		
		return ggt;
		
	}
	
	private void vorzeichenAnpassen() {
		if (nenner < 0) {
			zaehler *= -1;
			nenner *= -1;	
		}
	}
	
	
}
