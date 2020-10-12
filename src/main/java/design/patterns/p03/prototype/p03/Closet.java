package design.patterns.p03.prototype.p03;

import java.io.Serializable;

public class Closet implements Serializable {

	private static final long serialVersionUID = -2296530971043974155L;

	String name;

	Clothes clothes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Clothes getClothes() {
		return clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}

	public Closet(String name, Clothes clothes) {
		super();
		this.name = name;
		this.clothes = clothes;
	}

	@Override
	public String toString() {
		return "Closet [name=" + name + ", clothes=" + clothes + "]";
	}

}
