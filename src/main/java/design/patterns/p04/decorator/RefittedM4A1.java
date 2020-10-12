package design.patterns.p04.decorator;

public class RefittedM4A1 implements Gun {

	private M4A1 m4a1;

	public RefittedM4A1(M4A1 m4a1) {
		super();
		this.m4a1 = m4a1;
	}

	@Override
	public void shoot() {
		m4a1.setHasMuffler(true);
		m4a1.shoot();
	}

}
