package design.patterns.p11.iterator.p03;

public class MyListTest {

	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

}
