package design.patterns.p15.state.p03;

public class Context {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		state.method();
	}

}
