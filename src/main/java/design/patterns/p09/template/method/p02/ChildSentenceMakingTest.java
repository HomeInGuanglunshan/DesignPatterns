package design.patterns.p09.template.method.p02;

public class ChildSentenceMakingTest {

	public static void main(String[] args) {
		SentenceMaker maker = new ChildSentenceMaker();
		maker.setKnowHow(true);
		maker.makeSentence();
	}

}
