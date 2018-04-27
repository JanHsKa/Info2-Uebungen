package info.aufgabe4;

public class DoubleLinkedList<E> {
	
	/**
	 * 
	 * @author jancm
	 *
	 * @param <E> Datentyp, den die Liste speichern soll
	 */
	 private static final class ListElement<E> {
	        private E element;
	        private ListElement<E> next = null;
	        private ListElement<E> previous = null;

	        private ListElement(E element) {
	            this.element = element;
	        }
	    }
	 
	 private ListElement<E> first; 
	 private ListElement<E> last;
	 
	 private int size;
	  
	 /**
	 * Standardkonstruktor, erzeugt eine leere Liste.
	 */
	 public DoubleLinkedList() {
		size = 0;
		first = null;
		last = null;
	 }
	
	 private ListElement<E> getListElement(int index) {
		 ListElement<E> current;
		 if (index >= size) {
			 throw new IndexOutOfBoundsException();
		 }
		 
		 if (index > size / 2) {
			 current = last;
			 index = size - index - 1;
        	 while (index > 0) {
                 current = current.previous;
                 index--;
        	 }
        } else {
        	current = first;
        	while (index > 0) {
        		current = current.next;
        		index--;
        	}	
        }
		 
        return current;
	 }
	
	 /**
	  * Fuegt das angegebene Element als erstes in die Liste ein.
	  * @param value Wert, der in die Liste eingefuegt wird
	  */
	 public void addFirst(E value) {
		if (first == null) {
			first = new ListElement<E>(value);
			last = first;
		} else {
			ListElement<E> current = new ListElement<E>(value);
			first.previous = current;
			current.next = first;
			first = current;
		}
		size++;
	 }
	
	 /**
	  * Fuegt das angegebene Element hinten an die Liste an.
	  * @param value Element, welches an die Liste gehaengt wird
	  */
	 public void addLast(E value) {
		if (first == null) {
			 addFirst(value);
		} else {
			ListElement<E> current = new ListElement<E>(value);
			current.previous = last;
			last.next = current;
			last = current;
			size++;
		}
	 }
	
	 /**
	  * Fuegt das angegebene Element an der angegebenen Stele in der Liste ein.
	  * @param index Stelle, wo das Element eingefuegt werden soll
	  * @param value Element, welches eingefuegt werden soll
	  */
	 public void add(int index, E value) {
		if (index == 0) {
			addFirst(value);
		} else if (index == size - 1) {
			addLast(value);
		} else {
			ListElement<E> current = getListElement(index);
			ListElement<E> previous = getListElement(index - 1);
			ListElement<E> newElement = new ListElement<E>(value);
			newElement.previous = current.previous;
			newElement.next = current;
			current.previous = newElement;
			previous.next = newElement;	
			size++;	
		}
	 }
	
	 /**
	  * Gibt das Element zurueck, welches an der eingegebenen Stelle in der Liste steht, sofern vorhanden.
	  * @param index Stelle des gesuchten Elements
	  * @return Element an der eingegebenen Stelle
	  */
	 public E get(int index) {
		 return getListElement(index).element;
	 }
	
	 
	 /**
	  * Entfernt das erste Element in der Liste, die restlichen werden vorgeschoben.
	  * @return Element, welches entfernt wurde
	  */
	 
	 public E removeFirst() { 
		ListElement<E> current = getListElement(0);
		first = first.next;
		first.previous = null;
		size--;
		return current.element;
	 }
	
	 /**
	  * Entfernt das letzte Element der Liste.
	  * @return das entfernte Element
	  */
	 public E removeLast() {
		 ListElement<E> current = getListElement(size - 1);
		 last = last.previous;
		 last.next = null;
		 size--;
		 return current.element;
	 }
	 
	 /**
	  * Entfernt das Element, welches sich am angegebenen Index befindet, und gibt dieses zurück.
	  * @param index Index des zu entfernenden Elements
	  * @return
	  */
	 public E remove(int index) {
		 if (index == 0) {
			 return removeFirst();
		 } else if (index == size - 1) {
			 return removeLast();
		 } else {
			 ListElement<E> current = getListElement(index);
			 ListElement<E> previous = getListElement(index - 1);
			 ListElement<E> next = getListElement(index + 1);
			 next.previous = previous;
			 previous.next = next;
			 size--;
			 return current.element;
		 }
	 }
	
	 /**
	  * Gibt die groesse der Liste zurueck.
	  * @return Groesse der Liste
	  */
	 public int getSize() {
		return size;
	 }

}
