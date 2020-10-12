package design.patterns.p16.visitor.p01;

public interface Subject {
	public void accept(Visitor visitor);

	public String getSubject();
}
