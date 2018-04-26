package info.aufgabe4;

public class DoubleLinkedTest {

	/**
	 * main.
	 * @param args n
	 */
	public static void main(String[] args) {
		DoubleLinkedList<Integer> liste = new DoubleLinkedList<Integer>();
		
		liste.addFirst(1);
		liste.addFirst(5);
		liste.addFirst(2);
		liste.add(2, 4);
		
		for (int i = 0; i < 4; i++) {
			System.out.println(liste.get(i));
		}
		
		System.out.println(liste.getSize());

	}

}
