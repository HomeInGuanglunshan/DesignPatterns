package design.patterns.p05.proxy.p02.cglib;

public class CglibTest {

	public static void main(String[] args) {
		Man man = new Thug();
		man.beat();
	}

}
