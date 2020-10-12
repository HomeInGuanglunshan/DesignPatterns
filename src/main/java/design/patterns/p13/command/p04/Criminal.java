package design.patterns.p13.command.p04;

public abstract class Criminal {

	String name;

	Crime crime;

	public Criminal(String name) {
		this.name = name;
	}

	public abstract void commit(Crime crime);

}
