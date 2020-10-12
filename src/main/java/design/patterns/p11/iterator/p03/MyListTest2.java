package design.patterns.p11.iterator.p03;

public class MyListTest2 {

	public static void main(String[] args) {
		MyList<Car> list = new MyList<>();
		list.add(new Car("Benz"));
		list.add(new Car("TOYOTA"));
		list.add(new Car("Honda"));
		System.out.println(list);

		for (Iterator<Car> iterator = list.iterator(); iterator.hasNext();) {
			Car car = iterator.next();
			System.out.println(car);
			if (car.toString().startsWith("H")) {
				iterator.remove();
			}
		}
		System.out.println(list);

		list.add(new Car("BYD"));
		System.out.println(list);
	}

}
