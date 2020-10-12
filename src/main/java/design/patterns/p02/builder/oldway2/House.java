package design.patterns.p02.builder.oldway2;

public class House {

	String bedroom;

	String bathroom;

	String livingroom;

	String basement;

	String diningroom;

	String kitchen;

	String garage;

	String type;

	public String getBedroom() {
		return bedroom;
	}

	public void setBedroom(String bedroom) {
		this.bedroom = bedroom;
	}

	public String getBathroom() {
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String getLivingroom() {
		return livingroom;
	}

	public void setLivingroom(String livingroom) {
		this.livingroom = livingroom;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public String getDiningroom() {
		return diningroom;
	}

	public void setDiningroom(String diningroom) {
		this.diningroom = diningroom;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getGarage() {
		return garage;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " [bedroom=" + bedroom + ", bathroom=" + bathroom + ", livingroom=" + livingroom + ", basement="
				+ basement + ", diningroom=" + diningroom + ", kitchen=" + kitchen + ", garage=" + garage + "]";
	}

}
