package designPatterns.iterator.v2;

//Implementazione della collezione
class CollectionImpl<T> implements Collection<T> {

	private T[] elements;
    private int size;
    
    @SuppressWarnings("unchecked")
	public CollectionImpl(int collectionCapacity) {
        elements = (T[]) new Object[collectionCapacity];
        size = 0;
    }
    
    public void add(T element) {
        if (size < elements.length) {
            elements[size++] = element;
        }
    }
    
	@Override
	public Iterator<T> createIterator() {
		return new InnerIterator();
	}
	
	
	private class InnerIterator implements Iterator<T> {
		private int currentIndex;
		
		public InnerIterator() {
			currentIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			return currentIndex < size;
		}

		@Override
		public T next() {
//			if(this.hasNext())
				return elements[currentIndex++];
			
//			else throw new NoSuchElementException("No more elements in the collection.");
		}
		
	}

}
