package design.patterns.p02.builder.oldway2;

public class HutBuilder extends HouseBuilder {

	House hut = new House();

	@Override
	void buildBedroom() {
		hut.setBedroom("hay over there on the floor");
	}

	@Override
	void buildBathroom() {
		hut.setBathroom("if you want to take a shower, go to the riverside");
	}

	@Override
	void buildLivingroom() {
		hut.setLivingroom("sit on the mat and play poker with us");
	}

	@Override
	void buildBasement() {
		hut.setBasement("I have two shovels, shall we build a basement?");
	}

	@Override
	void buildDiningroom() {
		hut.setDiningroom("catch that mouse!");
	}

	@Override
	void buildKitchen() {
		hut.setKitchen("no firewood left, let's go into the forest and cut some");
	}

	@Override
	void buildGarage() {
		hut.setGarage("Do you mean stable?");
	}

	@Override
	void setType() {
		hut.setType("Hut");
	}

	@Override
	House deliverHouse() {
		return hut;
	}

}
