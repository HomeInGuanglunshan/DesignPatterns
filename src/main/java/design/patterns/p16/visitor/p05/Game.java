package design.patterns.p16.visitor.p05;

public class Game implements Media {

	@Override
	public void show(Student student, String content) {
		System.out.println(student + "正在玩《" + content + "》");
	}

	@Override
	public void attract(Student student) {
		student.enjoy(this);
	}

}
