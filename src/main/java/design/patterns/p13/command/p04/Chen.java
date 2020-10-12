package design.patterns.p13.command.p04;

public class Chen extends Criminal {

	public Chen(String name) {
		super(name);
	}

	@Override
	public void commit(Crime crime) {
		System.out.println(name + crime);
	}

}
