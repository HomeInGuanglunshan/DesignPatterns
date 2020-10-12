package design.patterns.p02.builder.oldway2;

public abstract class HouseBuilder {

	abstract void buildBedroom();

	abstract void buildBathroom();

	abstract void buildLivingroom();

	abstract void buildBasement();

	abstract void buildDiningroom();

	abstract void buildKitchen();

	abstract void buildGarage();

	abstract void setType();

	abstract House deliverHouse();

	public House construct() {
		buildBedroom();
		buildBathroom();
		buildLivingroom();
		buildBasement();
		buildDiningroom();
		buildKitchen();
		buildGarage();
		setType();
		return deliverHouse();
	}

}
