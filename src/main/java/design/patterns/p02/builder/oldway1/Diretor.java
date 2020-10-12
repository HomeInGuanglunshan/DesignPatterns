package design.patterns.p02.builder.oldway1;

public class Diretor {

	private ArtificialBeautyBuilder builder;

	public Diretor(ArtificialBeautyBuilder builder) {
		super();
		this.builder = builder;
	}

	public Woman construct() {
		builder.setHeight();
		builder.setWeight();
		builder.setBust();
		builder.setWaistLine();
		builder.setHipline();
		builder.setLipstick();
		builder.setHairColor();
		builder.setAge();
		builder.setType();
		return builder.createWoman();
	}

}
