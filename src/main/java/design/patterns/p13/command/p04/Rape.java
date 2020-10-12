package design.patterns.p13.command.p04;

public class Rape extends Crime {

	public Rape(Criminal criminal, String target) {
		super(criminal, target);
		this.name = "强奸";
	}

	@Override
	public void committed() {
		criminal.commit(this);
	}

}
