package design.patterns.p10.observer.p03;

public class Blackener extends Fan {

	public Blackener(String name, Qinsmoon qinsmoon) {
		super(qinsmoon);
		this.name = name;
	}

	@Override
	public void commment(String content) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(name).append("：对").append(content).append("不感兴趣"));
	}

}
