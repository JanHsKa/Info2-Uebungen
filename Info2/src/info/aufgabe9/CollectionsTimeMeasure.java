package info.aufgabe9;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
//mport java.util.Collections;

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
	 * Misst die Zeit, die verschiedene Datenstrukturen benoetigen, um Elemenete hinzuzufuegen.
	 */
	public void testAdd() {
		resetStructures();
		long startTime;
		long endTime;
		
		System.out.println("Test hinten anfuegen");
		System.out.println("Anzahl der Elemente, die hinzugefuegt werden: " + structureSize);
		System.out.println("Vector: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			vector.add(i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("ArrayList: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			arrayList.add(i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("LinkedList: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			linkedList.add(i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("HashSet: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			hashSet.add(i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("TreeSet: ");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < structureSize; i++) {
			treeSet.add(i);
		}
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
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
	 * Misst die Zeit, die benoetigt wird, um das zuletzt eingefuegte Element mit Iterator Durchlauf zu finden.
	 * @return
	 */
	public void searchIterator() {
		long startTime;
		long endTime = 0;
		
		System.out.println("Test Iterator");
		System.out.println("Anzahl der Elemente, die hinzugefuegt werden: " + structureSize);
		System.out.println("Vector: ");
		
		startTime = System.nanoTime();
		
		for (Iterator<Integer> iter = vector.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				endTime = System.nanoTime() - startTime;
			}
		}
	
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("ArrayList: ");
		
		startTime = System.nanoTime();
		
		for (Iterator<Integer> iter = arrayList.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				endTime = System.nanoTime() - startTime;
			}
		}
		
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("LinkedList: ");
		
		startTime = System.nanoTime();
		
		for (Iterator<Integer> iter = linkedList.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				endTime = System.nanoTime() - startTime;
			}
		}
		
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("HashSet: ");
		
		startTime = System.nanoTime();
		
		for (Iterator<Integer> iter = hashSet.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				endTime = System.nanoTime() - startTime;
			}
		}
		
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("TreeSet: ");
		
		startTime = System.nanoTime();
		
		for (Iterator<Integer> iter = treeSet.iterator(); iter.hasNext();) {
			if (iter.next().intValue() == structureSize - 1) {
				endTime = System.nanoTime() - startTime;
			}
		}
		
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
	}
	
	/**
	 * Misst die Zeit, die benoetigt wird, um das zuletzt eingefuegte Element 
	 * mit Binaersuche zu finden.
	 */
	public void searchBinary() {
		long startTime;
		long endTime;
		
		System.out.println("Test Binaersuche des letzten Elements (" + (structureSize - 1) + ")");
		System.out.println("Vector: ");
		
		startTime = System.nanoTime();
		
		Collections.binarySearch(vector, structureSize - 1);
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("ArrayList: ");
		
		startTime = System.nanoTime();
		
		Collections.binarySearch(arrayList, structureSize - 1);
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
	}
	
	/**
	 * Misst die Zeit, die benoetigt wird, um mit den eigenen Suchmethoden der 
	 * Datenstrukturen den zuletzt eingefuegten Wert zu finden.
	 */
	public void searchOwnMethod() {
		long startTime;
		long endTime = 0;
		
		System.out.println("Test eigene Suchmethoden");
		System.out.println("Anzahl der Elemente, die hinzugefuegt werden: " + structureSize);
		System.out.println("Vector: ");
		
		startTime = System.nanoTime();
		
		vector.indexOf(structureSize - 1);
	
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("ArrayList: ");
		
		startTime = System.nanoTime();
		
		arrayList.indexOf(structureSize - 1);
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("LinkedList: ");
		
		startTime = System.nanoTime();
		
		linkedList.indexOf(structureSize - 1);
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("HashSet: ");
		
		startTime = System.nanoTime();
		
		hashSet.contains(structureSize - 1);
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
        
        System.out.println("TreeSet: ");
		
		startTime = System.nanoTime();
		
		treeSet.contains(structureSize - 1);
		
		endTime = System.nanoTime() - startTime;
        System.out.println("Dauer:\t" + (endTime / 1000000.0) +  " [ms]");
        System.out.println();
	}
}
