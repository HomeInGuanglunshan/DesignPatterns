package design.patterns.p11.iterator.p03;

public class MyListTest4 {

	public static void main(String[] args) {
		MyList<String> list = new MyList<>();
		System.out.println(list);

		Iterator<String> iterator;
		for (iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		list.add("a");
		for (; iterator.hasPrevious();) {
			System.out.println(iterator.previous());
		}

		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

}
