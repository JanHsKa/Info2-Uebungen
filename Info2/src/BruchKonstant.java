
public class BruchKonstant {
	private int nenner;
	private int zaehler;
	
	/**
	 * Standardkonstruktor, der den Bruch 1/1 initialisiert.
	 */
	
	public BruchKonstant() {
		this.nenner = 1;
		this.zaehler = 1;
	}
	
	/**
	 * Allgemeiner Konstruktor, der einen Bruch mit den angegebenen Werten initialisiert.
	 * @param nenner Nenner des Bruches, darf nicht 0 sein
	 * @param zaehler Zaehler des Bruches
	 */

	public BruchKonstant(int zaehler, int nenner) {
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
	
	/*public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
		
		kuerzen();
	}*/
	
	/**
	 * @param nenner Wert den der Nenner annehmen soll, darf nicht 0 sein
	 */
	
	/*public void setNenner(int nenner) {
		this.nenner = nenner;
		
		vorzeichenAnpassen();
		kuerzen();
	}*/
	
	/**
	 * Addiert den eingegebenen Bruch hinzu.
	 * @param nenner Nenner des zu addierenden Bruches
	 * @param zaehler Zaehler des zu addierenden Bruches
	 */
	
	public BruchKonstant addieren(int zaehler, int nenner) {
		BruchKonstant summand = new BruchKonstant(zaehler, nenner);
		
		int zaehlerNeu = summand.getZaehler() * this.nenner + this.zaehler * summand.getNenner();
		int nennerNeu = this.nenner * summand.getNenner();
		
		return new BruchKonstant(zaehlerNeu, nennerNeu);
	}
	
	/**
	 * Subtrahiert den eingegebenen Bruch vom aktuellen Wert.
	 * @param nenner Nenner des zu Subtrahierenden Bruches
	 * @param zaehler Zaehler des zu Subtrahierenden Bruches
	 */
	
	public BruchKonstant subtrahieren(int zaehler, int nenner) {
		return addieren((-1) * zaehler, nenner);
	}
	
	/**
	 * Multipliziert den eingegeben Bruch mit dem aktuellen Wert.
	 * @param nenner Nenner des zu Multiplizierenden Bruches
	 * @param zaehler Zaehler des zu Multiplizierenden Bruches
	 */
	
	public BruchKonstant multiplizieren(int zaehler, int nenner) {
		int nennerNeu = this.nenner * nenner;
		int zaehlerNeu = this.zaehler * zaehler;
		
		return new BruchKonstant(zaehlerNeu, nennerNeu);
	}
	
	/**
	 * Dividiert den aktuellen Wert des Bruches durch den eingegeben Bruch.
	 * @param nenner Nenner des Divisors
	 * @param zaehler Zaehler des Divisors
	 */
	public BruchKonstant dividieren(int zaehler, int nenner) {
		return multiplizieren(nenner, zaehler);
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
