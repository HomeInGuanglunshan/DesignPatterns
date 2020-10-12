package design.patterns.p01.factory.abs.factory;

import design.patterns.p01.factory.factory.method.AwacsFactory;
import design.patterns.p01.factory.factory.method.BomberFactory;
import design.patterns.p01.factory.factory.method.FighterFactory;
import design.patterns.p01.factory.factory.method.PlaneFactory;
import design.patterns.p01.factory.factory.method.UavFactory;

public class AbstractFactory {

	public static PlaneFactory getFactory(String type) {
		switch (type) {
		case "Awacs":
			return new AwacsFactory();
		case "Bomber":
			return new BomberFactory();
		case "Fighter":
			return new FighterFactory();
		case "Uav":
			return new UavFactory();
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(getFactory("Uav").getPlane());
		System.out.println(getFactory("Fighter").getPlane());
	}
}
