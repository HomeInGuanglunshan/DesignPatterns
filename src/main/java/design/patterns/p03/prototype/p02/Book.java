package design.patterns.p03.prototype.p02;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 291275427087390155L;

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

}
