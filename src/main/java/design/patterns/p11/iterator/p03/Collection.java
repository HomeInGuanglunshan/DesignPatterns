package design.patterns.p11.iterator.p03;

public interface Collection<T> {

	void add(T element);

	Iterator<T> iterator();

}
