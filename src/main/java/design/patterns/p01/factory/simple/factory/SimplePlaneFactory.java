package design.patterns.p01.factory.simple.factory;

import design.patterns.p01.factory.entity.Awacs;
import design.patterns.p01.factory.entity.Bomber;
import design.patterns.p01.factory.entity.Fighter;
import design.patterns.p01.factory.entity.Plane;
import design.patterns.p01.factory.entity.Uav;

public class SimplePlaneFactory {

	public Plane getPlane(String type) {
		switch (type) {
		case "Awacs":
			return new Awacs();
		case "Bomber":
			return new Bomber();
		case "Fighter":
			return new Fighter();
		case "Uav":
			return new Uav();
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		SimplePlaneFactory factory = new SimplePlaneFactory();
		System.out.println(factory.getPlane("Awacs"));
	}
}
