package design.patterns.p14.memento.p03;

public class ChenQitai {

	public Quetion askQuetion() {
		Integer num1 = Utils.getRandomInteger();
		Integer num2 = Utils.getRandomInteger();
		Integer answer = num1 + num2;
		Quetion quetion = new Quetion(num1 + " + " + num2 + " = ?", answer);
		return quetion;
	}

	public Quetion reaskQuetion(Quetion quetion) {
		return quetion;
	}

}
