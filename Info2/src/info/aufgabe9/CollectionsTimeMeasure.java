package info.aufgabe9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;
//import java.util.stream.Stream;
import java.util.Collections;
import java.util.stream.*;

public class CollectionsTimeMeasure {
	private Vector<Integer> vector;
	private ArrayList<Integer> arrayList;
	private LinkedList<Integer> linkedList;
	private HashSet<Integer> hashSet;
	private TreeSet<Integer> treeSet;
	
	private int structureSize;
	
	/**
	 * Standard Konstruktor.
	 */
	
	public CollectionsTimeMeasure() {
		structureSize = 100000;
		resetStructures();
	}
	
	private void resetStructures() {
		vector = new Vector<Integer>();
		arrayList = new ArrayList<Integer>();
		linkedList = new LinkedList<Integer>();
		hashSet = new HashSet<Integer>();
		treeSet = new TreeSet<Integer>();
	}
	
	
	/**
	 * Fuellt einen Vector mit 100000 Zahlen.
	 */
	public void testAddVector() {
        long start = System.nanoTime();
        System.out.println("Vector: ");
		
		for (int i = 0; i < structureSize; i++) {
			vector.add(i);
		}
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuellt eine ArrayList mit 100000 Zahlen.
	 */
	public void testAddArrayList() {        
        long start = System.nanoTime();
        System.out.println("ArrayList: ");
		
        for (int i = 0; i < structureSize; i++) {
			arrayList.add(i);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuellt eine LinkedList mit 100000 Zahlen.
	 */
	public void testAddLinkedList() {        
        long start = System.nanoTime();
        System.out.println("LinkedList: ");
		
        for (int i = 0; i < structureSize; i++) {
			linkedList.add(i);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuellt ein HashSet mit 100000 Zahlen.
	 */
	public void testAddHashSet() {        
        long start = System.nanoTime();
        System.out.println("HashSet: ");
		
        for (int i = 0; i < structureSize; i++) {
			hashSet.add(i);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuellt ein TreeSet mit 100000 Zahlen.
	 */
	public void testAddTreeSet() {        
        long start = System.nanoTime();
        System.out.println("TreeSet: ");
		
        for (int i = 0; i < structureSize; i++) {
			treeSet.add(i);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Laesst die TestMethoden zum hinzufuegen von Werten hinten in verschiedene Datenstrukturen laufen.
	 */
	public void runAddTests() {
		resetStructures();
		System.out.println("Test hinten anfuegen");
		System.out.println("Anzahl der Elemente, die hinzugefuegt werden: " + structureSize);
		testAddVector();
		testAddArrayList();
		System.out.println("Test mit vorher festgelegter Groesse");
		vector = new Vector<Integer>(structureSize);
		arrayList = new ArrayList<Integer>(structureSize);
		testAddVector();
		testAddArrayList();
		testAddLinkedList();
		testAddHashSet();
		testAddTreeSet();
	}
	
	/**
	 * Misst die Zeit, die verschiedene Datenstrukturen brauchen, um nacheinander Elemente 
	 * an der ersten Stelle einzufuegen.
	 */
	public void testInsert() {
		resetStructures();
		long startTime;
		long endTime;
		
		System.out.println("Test vorne einfuegen");
		System.out.println("Anzahl der Elemente, die hinzugefuegt werden: " + structureSize);
		System.out.println("Vector: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			vector.insertElementAt(i, 0);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("ArrayList: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			arrayList.add(0, i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("LinkedList: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			linkedList.addFirst(i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuegt einem Vektor Zufallszahlen jeweils an der ersten Stelle ein.
	 */
	public void testVectorInsert() {
		long start = System.nanoTime();
        System.out.println("Vector: ");
		
        for (int i = 0; i < structureSize; i++) {
			vector.insertElementAt(i, 0);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuegt einem Vektor Zufallszahlen jeweils an der ersten Stelle ein.
	 */
	public void testArrayListInsert() {
		long start = System.nanoTime();
        System.out.println("ArrayList: ");
		
        for (int i = 0; i < structureSize; i++) {
			arrayList.add(0, i);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuegt einem Vektor Zufallszahlen jeweils an der ersten Stelle ein.
	 */
	public void testLinkedListInsert() {
		long start = System.nanoTime();
        System.out.println("LinkedList: ");
		
        for (int i = 0; i < structureSize; i++) {
			linkedList.addFirst(i);
		}
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Misst die Zeit, die verschiedene Datenstrukturen brauchen, um nacheinander Elemente 
	 * an der ersten Stelle einzufuegen.
	 */
	public void runInsertTests() {
		System.out.println("Test vorne einfuegen");
		System.out.println("Anzahl der Elemente, die hinzugefuegt werden: " + structureSize);
		resetStructures();
		testVectorInsert();
		testArrayListInsert();
		System.out.println("Test mit vorher festgelegter Groesse");
		vector = new Vector<Integer>(structureSize);
		arrayList = new ArrayList<Integer>(structureSize);
		testVectorInsert();
		testArrayListInsert();

		testLinkedListInsert();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einem Vector mit Iterator Durchlauf.
	 */
	public void testSearchIteratorVector() {
		long start = System.nanoTime();
		long end = start;
        System.out.println("Vector: ");
		
        for (Iterator<Integer> iter = vector.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				end = System.nanoTime(); 
			}
		}
		
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einer ArrayList mit Iterator Durchlauf.
	 */
	public void testSearchIteratorArrayList() {
		long start = System.nanoTime();
		long end = start;
        System.out.println("ArrayList: ");
		
        for (Iterator<Integer> iter = arrayList.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				end = System.nanoTime(); 
			}
		}
		
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einer LinkedList mit Iterator Durchlauf.
	 */
	public void testSearchIteratorLinkedList() {
		long start = System.nanoTime();
		long end = start;
        System.out.println("LinkedList: ");
		
        for (Iterator<Integer> iter = linkedList.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				end = System.nanoTime(); 
			}
		}
		
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einem HashSet mit Iterator Durchlauf.
	 */
	public void testSearchIteratorHashSet() {
		long start = System.nanoTime();
		long end = start;
        System.out.println("HashSet: ");
		
        for (Iterator<Integer> iter = hashSet.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				end = System.nanoTime(); 
			}
		}
		
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einem TreeSet mit Iterator Durchlauf.
	 */
	public void testSearchIteratorTreeSet() {
		long start = System.nanoTime();
		long end = start;
        System.out.println("TreeSet: ");
		
        for (Iterator<Integer> iter = treeSet.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				end = System.nanoTime(); 
			}
		}
		
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Misst die Zeit, die benoetigt wird, um das zuletzt eingefuegte Element mit Iterator Durchlauf zu finden.
	 * 
	 */
	public void runIteratorSearchTests() {
		System.out.println("Test IteratorSuche");
		System.out.println("Anzahl der Elemente, die hinzugefuegt wurden: " + structureSize);
		testSearchIteratorVector();
		testSearchIteratorArrayList();
		testSearchIteratorLinkedList();
		testSearchIteratorHashSet();
		testSearchIteratorTreeSet();
	}
	
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einem Vector mit Binaersuche.
	 */
	public void testSearchBinaryVector() {
		long start = System.nanoTime();
        System.out.println("Vector: ");
		
        Collections.binarySearch(vector, structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einer ArrayList mit Binaersuche.
	 */
	public void testSearchBinaryArrayList() {
		long start = System.nanoTime();
        System.out.println("ArrayList: ");
		
        Collections.binarySearch(arrayList, structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	
	/**
	 * Misst die Zeit, die benoetigt wird, um das zuletzt eingefuegte Element 
	 * mit Binaersuche zu finden.
	 */
	public void runBinarySearchTests() {
		System.out.println("Test Binaersuche des letzten Elements (" + (structureSize - 1) + ")");
		testSearchBinaryVector();
		testSearchBinaryArrayList();
	}

	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einer Vector mit der eigenen Suche.
	 */
	public void testSearchownMethodVector() {
		long start = System.nanoTime();
        System.out.println("Vector: ");
		
        vector.contains(structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einer ArrayList mit der eigenen Suche.
	 */
	public void testSearchownMethodArrayList() {
		long start = System.nanoTime();
        System.out.println("ArrayList: ");
		
        arrayList.contains(structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einer LinkedList mit der eigenen Suche.
	 */
	public void testSearchownMethodLinkedList() {
		long start = System.nanoTime();
        System.out.println("LinkedList: ");
		
        linkedList.contains(structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einem HashSet mit der eigenen Suche.
	 */
	public void testSearchownMethodHashSet() {
		long start = System.nanoTime();
        System.out.println("HashSet: ");
		
        hashSet.contains(structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Sucht das Zuletzt eingefuegte Element in einem TreeSet mit der eigenen Suche.
	 */
	public void testSearchownMethodTreeSet() {
		long start = System.nanoTime();
        System.out.println("TreeSet: ");
		
        treeSet.contains(structureSize - 1);
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	
	/**
	 * Misst die Zeit, die benoetigt wird, um mit den eigenen Suchmethoden der 
	 * Datenstrukturen den zuletzt eingefuegten Wert zu finden.
	 */
	public void runSearchOwnMethodTests() {
		System.out.println("Test eigene Suchmethoden");
		System.out.println("Anzahl der Elemente, die hinzugefuegt wurden: " + structureSize);
		testSearchownMethodVector();
		testSearchownMethodArrayList();
		testSearchownMethodLinkedList();
		testSearchownMethodHashSet();
		testSearchownMethodTreeSet();
	}
	
	/**
	 * Fuellt eine ArrayList mit Zufallszahlen durch die Add Methode.
	 */
	public void arrayListAdd() {
		resetStructures();
		System.out.println("ArrayList Add");
		long start = System.nanoTime();
		
		Random rnd = new Random();
		
		for (int i = 0; i < structureSize; i++) {
			arrayList.add(rnd.nextInt(10000));
		}
		
		
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Fuellt eine ArrayList mit Zufallszahlen durch einen Stream.
	 */
	public void arrayListStream() {
		resetStructures();
		System.out.println("ArrayList Stream");
		long start = System.nanoTime();
		Random rnd = new Random();
		arrayList = Stream.generate(() -> rnd.nextInt(10000)).limit(structureSize).collect(Collectors.toCollection(ArrayList::new));

		
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Addiert alle geraden Zahlen mit Iterator Durchlauf.
	 */
	public void sumEvenIterator() {
		System.out.println("Addieren Iterator");
		
        long start = System.nanoTime();
        int value = 0;
        int sum = 0;
        
        for (Iterator<Integer> iter = arrayList.iterator(); iter.hasNext();) {
        	value = iter.next();
        	if (value % 2 == 0) {
        		sum += value;
        	}
        }
        
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Addiert alle geraden Zahlen mithilfe eines Streams.
	 */
	public void sumEvenStream() {
		 System.out.println("Addieren Stream");
        long start = System.nanoTime();

        int sum = arrayList.stream().mapToInt(i -> i.intValue()).filter(element -> element % 2 == 0).sum();
		
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Addiert alle geraden Zahlen mithilfe eines Streams.
	 */
	public void sumEvenStreamParallel() {
		System.out.println("Addieren Stream Prallel");
        long start = System.nanoTime();

        int sum = arrayList.parallelStream().mapToInt(i -> i.intValue()).filter(element -> element % 2 == 0).sum();
		
		long end = System.nanoTime(); 
		long durationInMsec = end - start;
		
		System.out.println("Dauer:\t" + durationInMsec / 1000000.0 +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Ruft die Tests des zweiten Aufgabenteils auf.
	 */
	public void runAddAndSumTest() {
		resetStructures();
		System.out.println("Test Zufallszahlen hinzufuegen und Gerade Zahlen addieren");
		System.out.println("Anzahl der Elemente, die hinzugefuegt wurden: " + structureSize);
		arrayListAdd();
		resetStructures();
		arrayListStream();
		sumEvenIterator();
		sumEvenStream();
		sumEvenStreamParallel();
	}
}
