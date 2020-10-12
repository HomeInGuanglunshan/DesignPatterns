package design.patterns.p03.prototype.p01;

public class Sword implements Cloneable {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sword(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sword [name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
