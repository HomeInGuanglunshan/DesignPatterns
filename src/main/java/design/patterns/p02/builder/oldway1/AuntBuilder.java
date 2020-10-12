package design.patterns.p02.builder.oldway1;

public class AuntBuilder extends ArtificialBeautyBuilder {

	Woman aunt = new Woman();

	@Override
	void setHeight() {
		aunt.setHeight(170);
	}

	@Override
	void setWeight() {
		aunt.setWeight(60);
	}

	@Override
	void setBust() {
		aunt.setBust(100);
	}

	@Override
	void setWaistLine() {
		aunt.setWaistLine(60);
	}

	@Override
	void setHipline() {
		aunt.setHipline(100);
	}

	@Override
	void setLipstick() {
		aunt.setLipstick(drawLipstick());
	}

	@Override
	void setHairColor() {
		aunt.setHairColor("chestnut");
	}

	@Override
	void setAge() {
		aunt.setAge(35);
	}

	@Override
	void setType() {
		aunt.setType("Aunt");
	}

	@Override
	Woman createWoman() {
		return this.aunt;
	}

}
