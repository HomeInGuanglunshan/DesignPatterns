package design.patterns.p04.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		M4A1 m4a1 = new M4A1();
		m4a1.shoot();
		RefittedM4A1 refittedM4A1 = new RefittedM4A1(m4a1);
		refittedM4A1.shoot();
	}

}
