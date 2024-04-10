package designPatterns.adapter.headFirst.enumerationIterator.adapters;

import designPatterns.adapter.headFirst.enumerationIterator.interfaces.Enumeration;
import designPatterns.adapter.headFirst.enumerationIterator.interfaces.Iterator;

/*
 * Adapting an Enumeration to an Iterator.
 * 
 * Il client vuole interfacciarsi con Iterator, ma abbiamo un codice legacy che uttilizza Enumeration.
 * Iterator è la target interface, Enumeration è l'adaptee(l'adattato).
 * L'adapter ha al suo interno un istanza dell'adaptee.
 * */

public class EnumerationToIteratorAdapter implements Iterator<Object> {

	// Adaptee 
	private Enumeration enumeration;
//	Enum enumeration;  // java.util
	
	public EnumerationToIteratorAdapter(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

//	@Override
//	public default void remove();

}
