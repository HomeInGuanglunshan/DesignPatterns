package design.patterns.p02.builder.oldway1;

public class Woman {

	Integer height;

	Integer weight;

	Integer bust;

	Integer waistLine;

	Integer hipline;

	String lipstick;

	String hairColor;

	Integer age;

	String type;

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getBust() {
		return bust;
	}

	public void setBust(Integer bust) {
		this.bust = bust;
	}

	public Integer getWaistLine() {
		return waistLine;
	}

	public void setWaistLine(Integer waistLine) {
		this.waistLine = waistLine;
	}

	public Integer getHipline() {
		return hipline;
	}

	public void setHipline(Integer hipline) {
		this.hipline = hipline;
	}

	public String getLipstick() {
		return lipstick;
	}

	public void setLipstick(String lipstick) {
		this.lipstick = lipstick;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " [height=" + height + "cm, weight=" + weight + "kg, bust=" + bust + "cm, waistLine=" + waistLine
				+ "cm, hipline=" + hipline + "cm, lipstick=" + lipstick + ", hairColor=" + hairColor + ", age=" + age
				+ "]";
	}

}
