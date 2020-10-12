package design.patterns.p16.visitor.p01;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject：" + sub.getSubject());
	}
}
