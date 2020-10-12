package design.patterns.p02.builder.oldway2;

public class CommercialHouseBuilder extends HouseBuilder {

	House commercialHouse = new House();

	@Override
	void buildBedroom() {
		commercialHouse.setBedroom(
				"three bedrooms: one is for host and hostess, another is for children, the last one is for guest");
	}

	@Override
	void buildBathroom() {
		commercialHouse.setBathroom("There are flower sprinkling, heater, towel......");
	}

	@Override
	void buildLivingroom() {
		commercialHouse.setLivingroom("sit on the sofa, watch television");
	}

	@Override
	void buildBasement() {
		commercialHouse.setBasement("How can a thirty-floor house own its basement?");
	}

	@Override
	void buildDiningroom() {
		commercialHouse.setDiningroom("diningroom is beside the kitchen");
	}

	@Override
	void buildKitchen() {
		commercialHouse.setKitchen("open the ventilator when you cook");
	}

	@Override
	void buildGarage() {
		commercialHouse.setGarage("you can drive my Benz tonight in the garage");
	}

	@Override
	void setType() {
		commercialHouse.setType("Commercial House");
	}

	@Override
	House deliverHouse() {
		return commercialHouse;
	}

}
