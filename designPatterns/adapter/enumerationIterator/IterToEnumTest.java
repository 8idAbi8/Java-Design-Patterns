package designPatterns.adapter.enumerationIterator;

import java.util.ArrayList;

import designPatterns.adapter.enumerationIterator.adapters.IteratorToEnumerationAdapter;
import designPatterns.adapter.enumerationIterator.concreteClasses.ConcreteIterator;
import designPatterns.adapter.enumerationIterator.interfaces.Iterator;

import java.util.*;
/*
 * Test of IteratorToEnumeration Adapter
 * 
 * Write an Adapter that adapts an Iterator to an Enumeration. You can test your code by adapting an 
 * ArrayList. The ArrayList class supports the Iterator interface but doesn’t support Enumerations 
 * (well, not yet anyway). 
 * 
 * */


public class IterToEnumTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hello");
		list.add("world");
		list.add("!");
		
		Iterator<String> iterator = new ConcreteIterator<>(list);
		
		
		IteratorToEnumerationAdapter iteratorToEnumerationAdapter = new IteratorToEnumerationAdapter(iterator);
		
				
		
	}

}
