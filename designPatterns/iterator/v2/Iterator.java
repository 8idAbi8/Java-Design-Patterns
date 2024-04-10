
package designPatterns.iterator.v2;

//Interfaccia dell'iteratore
interface Iterator<T> {
	public boolean hasNext();
	public T next();
}
