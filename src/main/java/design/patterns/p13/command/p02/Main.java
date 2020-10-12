package design.patterns.p13.command.p02;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Barbecurer boy = new Barbecurer();
		Command1 command1 = new Command1(boy);
		Waiter waiter = new Waiter();
		waiter.setOrder(command1);
		waiter.notifyX();
	}

}