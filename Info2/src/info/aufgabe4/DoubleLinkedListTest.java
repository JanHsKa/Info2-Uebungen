package info.aufgabe4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;


public class DoubleLinkedListTest {
	private DoubleLinkedList<Integer> listInt;
	private DoubleLinkedList<String> listString;
	private DoubleLinkedList<Double> listDouble;
	
	/**
	 * initialisiert 3 linkedLists mit verschiedenen Datentypen.
	 */
	@Before
	public void createLinkeLists() {
		listInt = new DoubleLinkedList<Integer>();
		listString = new DoubleLinkedList<String>();
		listDouble = new DoubleLinkedList<Double>();
		
		listInt.addFirst(3);
		listInt.addFirst(2);
		listInt.addFirst(1);
		
		listString.addFirst("test3");
		listString.addFirst("test2");
		listString.addFirst("test1");
		
		listDouble.addFirst(7.0);
		listDouble.addFirst(6.0);
		listDouble.addFirst(5.0);
		
	}
	
	/**
	 * Konstruktor test.
	 */
	@Test
	public void testDoubleLinkedList() {
		assertTrue(listInt != null);
		assertTrue(listString != null);
		assertTrue(listDouble != null);
	}

	/**
	 * addfirst test.
	 */
	@Test
	public void testAddFirst() {
		listInt.addFirst(2);
		listString.addFirst("test");
		listDouble.addFirst(4.0);
		
		assertTrue(listInt.get(0) == 2);
		assertTrue(listString.get(0) == "test");
		assertTrue(listDouble.get(0) == 4.0);
	}

	/**
	 * addLast test.
	 */
	@Test
	public void testAddLast() {
		listInt.addLast(2);
		listString.addLast("test");
		listDouble.addLast(4.0);
		
		assertTrue(listInt.get(listInt.getSize() - 1) == 2);
		assertTrue(listString.get(listString.getSize() - 1) == "test");
		assertTrue(listDouble.get(listDouble.getSize() - 1) == 4.0);
	}

	/**
	 * add Test.
	 */
	@Test
	public void testAdd() {
		listInt.add(1, 6);
		listString.add(1, "test");
		listDouble.add(1, 4.0);
		
		assertTrue(listInt.get(1) == 6);
		assertTrue(listString.get(1) == "test");
		assertTrue(listDouble.get(1) == 4.0);
	}

	/**
	 * get Test.
	 */
	@Test
	public void testGet() {
		assertTrue(listInt.get(2) == 3);
		assertTrue(listString.get(1) == "test2");
		assertTrue(listDouble.get(0) == 5.0);
	}

	/**
	 * removeFirst Test.
	 */
	@Test
	public void testRemoveFirst() {
		assertTrue(listInt.removeFirst() == 1);
		assertTrue(listString.removeFirst() == "test1");
		assertTrue(listDouble.removeFirst() == 5.0);	
	}

	/**
	 * removeLast Test.
	 */
	@Test
	public void testRemoveLast() {
		assertTrue(listInt.removeLast() == 3);
		assertTrue(listString.removeLast() == "test3");
		assertTrue(listDouble.removeLast() == 7.0);
	}

	/**
	 * remove Test.
	 */
	@Test
	public void testRemove() {
		assertTrue(listInt.remove(1) == 2);
		assertTrue(listString.remove(1) == "test2");
		assertTrue(listDouble.remove(1) == 6.0);
	}
	
	/**
	 * getSize Test.
	 */
	@Test
	public void testGetSize() {
		assertTrue(listInt.getSize() == 3);
		assertTrue(listString.getSize() == 3);
		assertTrue(listDouble.getSize() == 3);
	}

}
