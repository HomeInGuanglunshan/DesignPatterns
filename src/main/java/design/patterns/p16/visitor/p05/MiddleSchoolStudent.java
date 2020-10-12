package design.patterns.p16.visitor.p05;

public class MiddleSchoolStudent implements Student {

	@Override
	public void enjoy(Internet internet) {
		internet.show(this, "http://www.bilibili.com/");
	}

	@Override
	public void enjoy(Game game) {
		game.show(this, "反恐精英");
	}

	@Override
	public void enjoy(Book book) {
		book.show(this, "钢铁是怎样炼成的");
	}

	@Override
	public String toString() {
		return "中学生";
	}

}
