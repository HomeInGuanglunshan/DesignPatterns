package design.patterns.p08.flyweight.p01;

public class ConcreteBook implements Book {

	// 被借出的书名
	private String name;

	public ConcreteBook(String name) {
		this.name = name;
	}

	@Override
	public void borrow() {
		System.out.println("图书馆借出一本书，书名为：" + this.name);
	}

}
