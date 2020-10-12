package design.patterns.p11.iterator.p03;

public class MyListTest3 {

	public static void main(String[] args) {
		MyList<String> list = new MyList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);

		Iterator<String> iterator;
		for (iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		for (; iterator.hasPrevious();) {
			System.out.println(iterator.previous());
		}
	}

}
