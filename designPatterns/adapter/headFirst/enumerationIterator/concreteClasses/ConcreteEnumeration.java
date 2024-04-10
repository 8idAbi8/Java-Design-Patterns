package designPatterns.adapter.headFirst.enumerationIterator.concreteClasses;

import java.util.List;

import designPatterns.adapter.headFirst.enumerationIterator.interfaces.Enumeration;

public class ConcreteEnumeration<T> implements Enumeration {

	private List<T> collection;
	private int index;
	
	public ConcreteEnumeration(List<T> collection) {
//		this.collection = new ArrayList<>(collection); // create a copy to avoid modifying the original list

		this.collection = collection;
		this.index = 0;
	}

	@Override
	public boolean hasMoreElements() {
		return index < collection.size();
	}

	@Override
	public Object nextElement() {
		
		if (hasMoreElements()) {
			T currentElement = collection.get(index);  // get: Returns the element at the specified position in this list
            index++;
            return currentElement;
		} 
		else {
			throw new java.util.NoSuchElementException();
		}
	}

}
