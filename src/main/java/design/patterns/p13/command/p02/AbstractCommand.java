package design.patterns.p13.command.p02;

public abstract class AbstractCommand {
	protected Barbecurer barbecurer;

	public AbstractCommand(Barbecurer barbecurer) {
		this.barbecurer = barbecurer;
	}

	public abstract void excuteCommand();
}