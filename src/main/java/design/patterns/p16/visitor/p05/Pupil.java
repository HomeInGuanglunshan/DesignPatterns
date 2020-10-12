package design.patterns.p16.visitor.p05;

public class Pupil implements Student {

	@Override
	public void enjoy(Internet internet) {
		internet.show(this, "http://www.4399.com/");
	}

	@Override
	public void enjoy(Game game) {
		game.show(this, "连连看");
	}

	@Override
	public void enjoy(Book book) {
		book.show(this, "十万个为什么");
	}

	@Override
	public String toString() {
		return "小学生";
	}

}
