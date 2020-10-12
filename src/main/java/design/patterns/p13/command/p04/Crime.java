package design.patterns.p13.command.p04;

public abstract class Crime {

	String name;

	String target;

	Criminal criminal;

	public Crime(Criminal criminal, String target) {
		this.criminal = criminal;
		this.target = target;
	}

	public abstract void committed();

	@Override
	public String toString() {
		return name + target;
	}

}
