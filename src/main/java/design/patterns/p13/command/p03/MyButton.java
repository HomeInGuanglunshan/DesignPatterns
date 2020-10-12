package design.patterns.p13.command.p03;

public abstract class MyButton {
	public void click(Command c) {
		c.exe();
	}
}