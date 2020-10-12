package design.patterns.p13.command.p03;

public class Client {
	public static void main(String[] args) {
		Command save = new SaveCommand();
		MyButton btn = new MyButton() {
		};
		System.out.println(save.getClass().getSimpleName() + " click");
		btn.click(save);
		Command exit = () -> {
			System.exit(0);
		};
		System.out.println(exit.getClass().getSimpleName() + " click");
		btn.click(exit);
	}
}