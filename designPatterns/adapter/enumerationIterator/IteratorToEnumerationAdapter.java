package designPatterns.adapter.enumerationIterator;

/*
 * Adapting an Iterator to an Enumeration.
 * 
 * While Java has gone in the direction of the Iterator, there is nevertheless a lot of legacy client code 
 * that depends on the Enumeration interface, so an Adapter that converts an Iterator to an Enumeration 
 * is also quite useful.
 * Write an Adapter that adapts an Iterator to an Enumeration. You can test your code by adapting an 
 * ArrayList. 
 * The ArrayList class supports the Iterator interface but doesn’t support Enumerations 
 * (well, not yet anyway).
 *  
 * */


public class IteratorToEnumerationAdapter implements Enumeration {

	Iterator iterator;
		
	public IteratorToEnumerationAdapter(Iterator iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
