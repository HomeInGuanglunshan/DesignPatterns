package design.patterns.p10.observer.p03;

public class Fanatic extends Fan {

	public Fanatic(String name, Qinsmoon qinsmoon) {
		super(qinsmoon);
		this.name = name;
	}

	@Override
	public void commment(String content) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(name).append("：沉迷").append(content).append("不能自拔"));
	}

}
