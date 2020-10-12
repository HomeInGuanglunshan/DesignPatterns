package design.patterns.p11.iterator.p03;

public class MyList<T> implements Collection<T> {

	Object[] arr = new Object[10];

	int size;

	@Override
	public void add(T element) {
		arr[size++] = element;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this);
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int l = size - 1;
		for (int i = 0; i < l; i++) {
			sb.append(arr[i]).append(", ");
		}
		sb.append(arr[l]).append("]");
		return sb.toString();
	}

}
