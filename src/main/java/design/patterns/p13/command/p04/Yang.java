package design.patterns.p13.command.p04;

public class Yang extends Criminal {

	public Yang(String name) {
		super(name);
	}

	@Override
	public void commit(Crime crime) {
		System.out.println(name + crime);
	}

}
