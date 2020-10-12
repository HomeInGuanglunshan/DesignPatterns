package design.patterns.p09.template.method.p02;

public class ChildSentenceMaker extends SentenceMaker {

	@Override
	public String who() {
		return readRandomLine(ChildBehavior.who.getPath());
	}

	@Override
	public String when() {
		return readRandomLine(ChildBehavior.when.getPath());
	}

	@Override
	public String where() {
		return readRandomLine(ChildBehavior.where.getPath());
	}

	@Override
	public String how() {
		return readRandomLine(ChildBehavior.how.getPath());
	}

	@Override
	public String doWhat() {
		return readRandomLine(ChildBehavior.doWhat.getPath());
	}

	@Override
	public void setKnowHow(boolean knowHow) {
		super.knowHow = knowHow;
	}

}
