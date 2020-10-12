package design.patterns.p04.decorator;

public class M4A1 implements Gun {

	boolean hasMuffler = false;

	public boolean isHasMuffler() {
		return hasMuffler;
	}

	public void setHasMuffler(boolean hasMuffler) {
		this.hasMuffler = hasMuffler;
	}

	@Override
	public void shoot() {
		if (hasMuffler) {
			System.out.println("XiuXiuXiu");
		} else {
			System.out.println("TakTakTak");
		}
	}

}
