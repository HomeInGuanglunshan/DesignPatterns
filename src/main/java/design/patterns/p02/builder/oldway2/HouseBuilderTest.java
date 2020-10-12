package design.patterns.p02.builder.oldway2;

public class HouseBuilderTest {

	public static void main(String[] args) {
		HouseBuilder hutBuilder = new HutBuilder();
		System.out.println(hutBuilder.construct());

		HouseBuilder commercialHouseBuilder = new CommercialHouseBuilder();
		System.out.println(commercialHouseBuilder.construct());
	}

}
