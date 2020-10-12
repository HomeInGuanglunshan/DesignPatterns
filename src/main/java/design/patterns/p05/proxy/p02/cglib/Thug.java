package design.patterns.p05.proxy.p02.cglib;

public class Thug extends Man {

	@Override
	public void beat() {
		System.out.println("What do you want?");
		super.beat();
		System.out.println("I will beat him up");
	}

}
