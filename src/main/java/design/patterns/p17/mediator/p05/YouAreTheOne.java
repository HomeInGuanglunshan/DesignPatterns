package design.patterns.p17.mediator.p05;

public class YouAreTheOne {

	public static void main(String[] args) {
		AuntChen auntChen = new AuntChen();
		auntChen.register(new LiangWenli());
		auntChen.register(new XiaoJiang());
		auntChen.register(new YangZedu());
		auntChen.register(new HuangMinghao());
		auntChen.match();
	}

}
