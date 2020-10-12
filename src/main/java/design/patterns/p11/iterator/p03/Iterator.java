package design.patterns.p11.iterator.p03;

public interface Iterator<T> {

	T previous();

	T next();

	boolean hasNext();

	void remove();

	boolean hasPrevious();

}
