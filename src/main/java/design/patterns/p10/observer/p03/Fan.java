package design.patterns.p10.observer.p03;

public abstract class Fan {

	String name;

	public Fan(Qinsmoon qinsmoon) {
		qinsmoon.addFans(this);
	}

	public abstract void commment(String content);

}
