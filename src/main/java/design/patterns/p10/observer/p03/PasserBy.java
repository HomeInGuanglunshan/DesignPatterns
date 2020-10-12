package design.patterns.p10.observer.p03;

public class PasserBy extends Fan {

	public PasserBy(String name, Qinsmoon qinsmoon) {
		super(qinsmoon);
		this.name = name;
	}

	@Override
	public void commment(String content) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(name).append("：").append(content).append("还不错"));
	}

}
