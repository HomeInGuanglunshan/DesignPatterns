package design.patterns.p05.proxy.p01.jdkdynamic;

public class JdkDynamicTest {

	public static void main(String[] args) {
		Defender defender = new Layer();
		defender.defend();
	}

}
