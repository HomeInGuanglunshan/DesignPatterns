package design.patterns.p16.visitor.p01;

public class Test {

	public static void main(String[] args) {

		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
