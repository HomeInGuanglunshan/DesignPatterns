package design.patterns.p13.command.p04;

public class Murder extends Crime {

	public Murder(Criminal criminal, String target) {
		super(criminal, target);
		this.name = "谋杀";
	}

	@Override
	public void committed() {
		criminal.commit(this);
	}

}
