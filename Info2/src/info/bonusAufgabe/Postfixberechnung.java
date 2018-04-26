package info.bonusAufgabe;

import java.util.StringTokenizer;
import java.util.ArrayList;

public class Postfixberechnung {

	/**
	 * comment.
	 */
	public Postfixberechnung() {
		
	}
	
	/**
	 * Funktion, die aus einem eingegebenen Postfix den Wert berechnet.
	 * @param eingabe Korrekt formierter Postfix als String
	 * @return Wert des eingegebenen Postfix
	 */
	public int postfixBerechnen(String eingabe) {
		String merker;

		StringTokenizer token = new StringTokenizer(eingabe);
		
		ArrayList<Integer> stackArray = new ArrayList<Integer>();
		
		int index = -1;
		
		while (token.hasMoreTokens()) {
			merker = token.nextToken();

			if (merker.equals("+") || merker.equals("-") || merker.equals("*")) {
				rechenAktion(stackArray, index, merker);
				index--;
			} else {
				stackArray.add(Integer.parseInt(merker));
				index++;
			}
			
		}
		
		return stackArray.get(index);
	}
	
	private void rechenAktion(ArrayList<Integer> stack, int index, String rechenZeichen) {
		int zwischenErgebnis;

		switch (rechenZeichen) {
		case "+":
			zwischenErgebnis = stack.get(index) + stack.get(index - 1);	
			break;
		case "-":
			zwischenErgebnis = stack.get(index - 1) - stack.get(index);	
			break;
		case "*":
			zwischenErgebnis = stack.get(index) * stack.get(index - 1);	
			break;
		default:
			zwischenErgebnis = 0;
			break;
		}
		
		stack.remove(index);
		index--;
		stack.remove(index);
		stack.add(zwischenErgebnis);
		
	}
	
	

}
