package designPatterns.iterator.v2;

//Interfaccia della collezione
interface Collection<T> {
	public Iterator<T> createIterator();

}
