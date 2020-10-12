package design.patterns.p16.visitor.p03;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
