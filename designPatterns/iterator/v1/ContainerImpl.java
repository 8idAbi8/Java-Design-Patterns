package designPatterns.iterator.v1;

import java.util.ArrayList;
import java.util.List;


class ContainerImpl implements Container {
	
	private List<String> list;
	
	public ContainerImpl() {
		this.list = new ArrayList<>();
	}
	
	@Override
	public Iterator getIterator() {
		return new InnerIterator();
	}
	
	public void add(String word) {
		list.add(word);
	}
	
	// INNER CLASS
	class InnerIterator implements Iterator {
		
		private int index;
		
		public InnerIterator() {
			this.index = 0;
		}
		
		@Override
		public boolean hasNext() {
			if (index < list.size()) return true;
			else return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) return list.get(index++);
			else return null;
		}	
	}
}


