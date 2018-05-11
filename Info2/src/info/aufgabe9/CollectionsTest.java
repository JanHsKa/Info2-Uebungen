package info.aufgabe9;

public class CollectionsTest {

	/**
	 * Main Methode, die Testmethoden ausfuehrt.
	 * @param args .
	 */
	public static void main(String[] args) {
		CollectionsTimeMeasure collectionTime = new CollectionsTimeMeasure();
		
		collectionTime.testAdd();
		collectionTime.searchIterator();
		collectionTime.searchBinary();
		collectionTime.searchOwnMethod();
		
		collectionTime.testInsert();
		collectionTime.searchIterator();
		collectionTime.searchBinary();
		collectionTime.searchOwnMethod();

	}

}
