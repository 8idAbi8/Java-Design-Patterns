package designPatterns.adapter.headFirst.enumerationIterator.concreteClasses;

import java.util.List;

import designPatterns.adapter.headFirst.enumerationIterator.interfaces.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {

	private List<T> collection;
	private int currentIndex;

	public ConcreteIterator(List<T> collection) {
//		this.collection = new ArrayList<>(collection); // create a copy to avoid modifying the original list
		
		this.collection = collection;
		this.currentIndex = 0;
	}

	
//	Returns true if the iteration has more elements.
	@Override
	public boolean hasNext() {
		return currentIndex < collection.size();
	}

	@Override
	public Object next() {

		if (hasNext()) {
			T currentElement = collection.get(currentIndex);  // get: Returns the element at the specified position in this list
            currentIndex++;
            return currentElement;
		} 
		else {
			throw new java.util.NoSuchElementException();
		}
			
	}

}
