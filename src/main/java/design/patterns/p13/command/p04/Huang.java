package design.patterns.p13.command.p04;

public class Huang extends Criminal {

	public Huang(String name) {
		super(name);
	}

	@Override
	public void commit(Crime crime) {
		System.out.println(name + crime);
	}

}
