package design.patterns.p03.prototype.p03;

import java.io.Serializable;

public class Clothes implements Serializable {

	private static final long serialVersionUID = 5325068115699997254L;

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Clothes(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Clothes [name=" + name + "]";
	}

}
