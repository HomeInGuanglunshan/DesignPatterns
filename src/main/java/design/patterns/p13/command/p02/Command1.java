package design.patterns.p13.command.p02;

public class Command1 extends AbstractCommand {

	/**
	 * @param barbecurer
	 */
	public Command1(Barbecurer barbecurer) {
		super(barbecurer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see day_8_command.AbstractCommand#excuteCommand()
	 */
	@Override
	public void excuteCommand() {
		System.out.println("开始烤羊肉串");
	}

	@Override
	public String toString() {
		return "烤羊肉串";
	}

}