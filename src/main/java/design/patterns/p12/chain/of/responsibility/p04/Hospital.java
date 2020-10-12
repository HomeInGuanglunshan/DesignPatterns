package design.patterns.p12.chain.of.responsibility.p04;

public class Hospital {

	public static void main(String[] args) {
		Doctor huatuo = new Doctor("华佗", 10);
		Doctor zhangzhongjing = new Doctor("张仲景", 8);
		Doctor lishizhen = new Doctor("李时珍", 5);

		lishizhen.setBetterDoctor(zhangzhongjing);
		zhangzhongjing.setBetterDoctor(huatuo);

		lishizhen.heal(new Patient("牛二", 5));
		System.out.println();
		lishizhen.heal(new Patient("张三", 6));
		System.out.println();
		lishizhen.heal(new Patient("王五", 9));
		System.out.println();
		lishizhen.heal(new Patient("李四", 11));
	}

}
