package design.patterns.p09.template.method.p02;

public class AdultSentenceMakingTest {

	public static void main(String[] args) {
		SentenceMaker maker = new AdultSentenceMaker();
		maker.setKnowHow(true);
		maker.makeSentence();
	}

}
