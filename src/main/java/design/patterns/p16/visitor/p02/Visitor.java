package design.patterns.p16.visitor.p02;

public interface Visitor {

	// 访问工程师类型
	void visit(Engineer engineer);

	// 访问经理类型
	void visit(Manager manager);
}