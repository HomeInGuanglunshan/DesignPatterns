package design.patterns.p05.proxy.p01.jdkdynamic;

public class Layer implements Defender {

	Defendant defendant;

	public Layer() {
		super();
		this.defendant = new Defendant();
	}

	@Override
	public void defend() {
		prepare();
		defendant.defend();
		System.out.println("I am the attorney of the defendant, now......");
		conclude();

	}

	public void prepare() {
		System.out.println("collect files");
		System.out.println("==============================");
	}

	public void conclude() {
		System.out.println("==============================");
		System.out.println("thank judge");
	}

}
