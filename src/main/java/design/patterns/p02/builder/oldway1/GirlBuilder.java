package design.patterns.p02.builder.oldway1;

public class GirlBuilder extends ArtificialBeautyBuilder {

	Woman girl = new Woman();

	@Override
	void setHeight() {
		girl.setHeight(120);
	}

	@Override
	void setWeight() {
		girl.setWeight(22);
	}

	@Override
	void setBust() {
		girl.setBust(60);
	}

	@Override
	void setWaistLine() {
		girl.setWaistLine(45);
	}

	@Override
	void setHipline() {
		girl.setHipline(60);
	}

	@Override
	void setLipstick() {
		girl.setLipstick(null);
	}

	@Override
	void setHairColor() {
		girl.setHairColor("black");
	}

	@Override
	void setAge() {
		girl.setAge(8);
	}

	@Override
	void setType() {
		girl.setType("Girl");
	}

	@Override
	Woman createWoman() {
		return girl;
	}

}
