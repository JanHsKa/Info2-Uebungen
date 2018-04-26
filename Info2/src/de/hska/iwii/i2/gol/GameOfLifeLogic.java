package de.hska.iwii.i2.gol;
/**
 * Die eigentliche Spielelogik. Das Spielfeld wird hier nicht
 * als zyklisch geschlossen betrachtet wird.
 *
 */
public class GameOfLifeLogic {
	
	private boolean[][] aktuelleGeneration;

	/**
	 * Setzt das angegebene Array als Startgeneration.
	 * @param generation Zweidimensionales Array aus boolean
	 */
	public void setStartGeneration(boolean[][] generation) {
		aktuelleGeneration = generation;
	}

	/**
	 * Berechnet die neue Generation an lebenden Zellen und aktualisiert das Spielfeld.
	 */
	public void nextGeneration() {
		boolean[][] neueGeneration = new boolean[aktuelleGeneration.length][aktuelleGeneration[0].length];
		
		for (int i = 0; i < aktuelleGeneration.length; i++) {
			for (int j = 0; j < aktuelleGeneration[i].length; j++) {
				if (isCellAlive(i, j))  {
					neueGeneration[i][j] = pruefeLebend(i, j); 
				} else {
					neueGeneration[i][j] = pruefeTot(i, j);
				}
			}
		}
		
		aktuelleGeneration = neueGeneration;
	}

	/**
	 * Gibt zurueck, ob die Zelle in diesem Feld im Moment lebt oder nicht.
	 * @param x X Koordinate 
	 * @param y Y Koordinate
	 * @return True(lebend) oder False(tot) 
	 */
	public boolean isCellAlive(int x, int y) {
		return aktuelleGeneration[x][y];
	}
	
	private boolean pruefeLebend(int x, int y) {
		int nachbarn = zaehleLebendeNachbarZellen(x, y);

		if (nachbarn < 2 || nachbarn > 3) {
			return false;
		}
		
		return true;
	}
	
	private boolean pruefeTot(int x, int y) {
		int nachbarn = zaehleLebendeNachbarZellen(x, y);
		
		if (nachbarn == 3) {
			return true;
		}
		
		return false;
	}
	
	private int zaehleLebendeNachbarZellen(int x, int y) {
		int anzahlLebenderNachbarn = 0;
		
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if ((i != x || j != y) && pruefeObFeldExistiert(i, j)) {
					if (isCellAlive(i, j)) {
						anzahlLebenderNachbarn++;
					}
				}
			}
		}
		
		return anzahlLebenderNachbarn;
	}
	
	private boolean pruefeObFeldExistiert(int x, int y) {
		if (x >= 0 && x < aktuelleGeneration.length) {
			if (y >= 0 && y < aktuelleGeneration[x].length) {
				return true;
			}
		}
		
		return false;
	}
}