package design.patterns.p03.prototype.p01;

public class Warrior implements Cloneable {

	Sword sword;

	String name;

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Warrior(Sword sword, String name) {
		super();
		this.sword = sword;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Warrior [sword=" + sword + ", name=" + name + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Warrior cloneWarrior = (Warrior) super.clone();
//		cloneWarrior.sword = (Sword) this.sword.clone(); // 深复制。注释掉后则浅复制
		return cloneWarrior;
	}

}
