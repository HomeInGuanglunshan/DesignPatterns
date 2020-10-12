package design.patterns.p16.visitor.p05;

public class Colleger implements Student {

	@Override
	public void enjoy(Internet internet) {
		internet.show(this, "http://www.11kkmm.com/");
	}

	@Override
	public void enjoy(Game game) {
		game.show(this, "尾行");
	}

	@Override
	public void enjoy(Book book) {
		book.show(this, "金瓶梅");
	}

	@Override
	public String toString() {
		return "大学生";
	}

}
