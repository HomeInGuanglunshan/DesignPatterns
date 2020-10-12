package design.patterns.p01.factory.factory.method;

public class FactoryMethod {

	public static void main(String[] args) {
		FighterFactory fighterFactory = new FighterFactory();
		System.out.println(fighterFactory.getPlane());
		BomberFactory bomberFactory = new BomberFactory();
		System.out.println(bomberFactory.getPlane());
	}
}
