package design.patterns.p07.bridge.p01;

public class Blue implements Color {
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "蓝色的" + name + ".");
	}
}
