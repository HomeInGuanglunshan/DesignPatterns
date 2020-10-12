package design.patterns.p15.state.p03;

public class Test {

	public static void main(String[] args) {

		Context context = new Context();

		State first = new FirstState();
		State second = new SecondState();

		context.setState(first);
		context.method();

		context.setState(second);
		context.method();

	}
}
