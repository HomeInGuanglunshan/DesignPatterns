package design.patterns.p07.bridge.p01;

public class Red implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "红色的" + name + ".");
	}

}
