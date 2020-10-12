package design.patterns.p09.template.method.p02;

public class AdultSentenceMaker extends SentenceMaker {

	@Override
	public String who() {
		return readRandomLine(AdultBehavior.who.getPath());
	}

	@Override
	public String when() {
		return readRandomLine(AdultBehavior.when.getPath());
	}

	@Override
	public String where() {
		return readRandomLine(AdultBehavior.where.getPath());
	}

	@Override
	public String how() {
		return readRandomLine(AdultBehavior.how.getPath());
	}

	@Override
	public String doWhat() {
		return readRandomLine(AdultBehavior.doWhat.getPath());
	}

	@Override
	public void setKnowHow(boolean knowHow) {
		super.knowHow = knowHow;
	}

}
