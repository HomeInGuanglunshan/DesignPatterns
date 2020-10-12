package design.patterns.p15.state.p02;

public class StatePatternDemo2 {

	public static void main(String[] args) {

		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState());

	}

}
