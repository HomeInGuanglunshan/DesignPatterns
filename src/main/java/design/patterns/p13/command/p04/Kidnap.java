package design.patterns.p13.command.p04;

public class Kidnap extends Crime {

	public Kidnap(Criminal criminal, String target) {
		super(criminal, target);
		this.name = "绑架";
	}

	@Override
	public void committed() {
		criminal.commit(this);
	}

}
