package design.patterns.p07.bridge.p01;

public class Green implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "绿色的" + name + ".");
	}

}
