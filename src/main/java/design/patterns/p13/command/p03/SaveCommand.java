package design.patterns.p13.command.p03;

public class SaveCommand implements Command {
	@Override
	public void exe() {
		new MyDialog().foo(); // Receiver
	}

}