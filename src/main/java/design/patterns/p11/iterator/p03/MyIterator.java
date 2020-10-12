package design.patterns.p11.iterator.p03;

public class MyIterator<T> implements Iterator<T> {

	int i;

	MyList<T> myList;

	public MyIterator(MyList<T> myList) {
		this.myList = myList;
	}

	@Override
	public boolean hasPrevious() {
		return i > 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T previous() {
		return (T) myList.arr[--i];
	}

	@Override
	public boolean hasNext() {
		return i < myList.size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		return (T) myList.arr[i++];
	}

	@Override
	public void remove() {
		int l = --myList.size;
		if (i == l) {
			myList.arr[i] = null;
			return;
		}
		int j;
		for (j = i; j < l; j++) {
			myList.arr[j] = myList.arr[j + 1];
		}
		myList.arr[l] = null;
	}

}
