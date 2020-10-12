package design.patterns.p14.memento.p03;

public class Quetion {

	String content;

	Integer answer;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

	public Quetion(String content, Integer answer2) {
		super();
		this.content = content;
		this.answer = answer2;
	}

	@Override
	public String toString() {
		return content;
	}

}
