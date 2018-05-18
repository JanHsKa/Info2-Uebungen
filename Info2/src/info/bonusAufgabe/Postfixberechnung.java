package info.bonusAufgabe;

import java.util.StringTokenizer;
import java.util.Stack;

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
		Stack<Integer> speicher = new Stack<Integer>();
		
		StringTokenizer token = new StringTokenizer(eingabe);

		
		while (token.hasMoreTokens()) {
			merker = token.nextToken();

			if (merker.equals("+") || merker.equals("-") || merker.equals("*")) {
				rechenAktion(speicher, merker);
			} else {
				speicher.push(Integer.parseInt(merker));
			}
			
		}
		
		return speicher.pop();
	}
	
	private void rechenAktion(Stack<Integer> stack, String rechenZeichen) {
		int zwischenErgebnis;

		switch (rechenZeichen) {
		case "+":
			zwischenErgebnis = stack.pop();	
			zwischenErgebnis += stack.pop();	
			break;
		case "-":
			zwischenErgebnis = stack.pop() * (-1);
			zwischenErgebnis += stack.pop();
			break;
		case "*":
			zwischenErgebnis = stack.pop();
			zwischenErgebnis *= stack.pop();
			break;
		default:
			zwischenErgebnis = 0;
			break;
		}
		
		stack.push(zwischenErgebnis);
		
	}
	
	

}
