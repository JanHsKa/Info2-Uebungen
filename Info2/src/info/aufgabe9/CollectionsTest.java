package info.aufgabe9;

public class CollectionsTest {

	/**
	 * Main Methode, die Testmethoden ausfuehrt.
	 * @param args .
	 */
	public static void main(String[] args) {
		CollectionsTimeMeasure collectionTime = new CollectionsTimeMeasure();
		
		collectionTime.runAddTests();
		collectionTime.runIteratorSearchTests();
		collectionTime.runBinarySearchTests();
		collectionTime.runSearchOwnMethodTests();
		
		collectionTime.runInsertTests();
		collectionTime.runIteratorSearchTests();
		collectionTime.runBinarySearchTests();
		collectionTime.runSearchOwnMethodTests();
		
		collectionTime.runAddAndSumTest();

	}

}
