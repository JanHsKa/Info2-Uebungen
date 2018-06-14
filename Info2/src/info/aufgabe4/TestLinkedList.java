package info.aufgabe4;



public class TestLinkedList {

	/**
	 * main.
	 * @param args args
	 */
	public static void main(String[] args) {
		DoubleLinkedList<Integer> liste = new DoubleLinkedList<Integer>();
		liste.addLast(2);
		liste.addFirst(3);
		liste.addLast(4);
		liste.remove(0);
		liste.remove(0);
		liste.addLast(1);
		
		
		for (int i = 0; i < liste.getSize(); i++) {
			System.out.println(liste.get(i));
		}

	}

}
