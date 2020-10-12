package design.patterns.p05.proxy.p01.jdkdynamic;

public class Defendant implements Defender {

	@Override
	public void defend() {
		System.out.println("My layer will defend for me");
	}

}
