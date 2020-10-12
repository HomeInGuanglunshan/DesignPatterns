package design.patterns.p07.bridge.p01;

public class White implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "白色的" + name + ".");
	}

}
