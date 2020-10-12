package design.patterns.p14.memento.p03;

import java.util.Random;

public class Utils {

	private static Random random = new Random();

	public static Integer getRandomInteger() {
		return random.nextInt(100);
	}

}
