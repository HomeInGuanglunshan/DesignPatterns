package design.patterns.p15.state.p02;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop State";
	}
}
