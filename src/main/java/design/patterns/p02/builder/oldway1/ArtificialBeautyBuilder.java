package design.patterns.p02.builder.oldway1;

import java.util.Random;

public abstract class ArtificialBeautyBuilder {

	abstract void setHeight();

	abstract void setWeight();

	abstract void setBust();

	abstract void setWaistLine();

	abstract void setHipline();

	abstract void setLipstick();

	abstract void setHairColor();

	abstract void setAge();

	abstract void setType();

	public String drawLipstick() {
		switch (new Random().nextInt(4)) {
		case 0:
			return "YSL";
		case 1:
			return "MAOGEPING";
		case 2:
			return "CHANEL";
		default:
			return "DIOR";
		}
	}

	abstract Woman createWoman();

}
