package design.patterns.p15.state.p04;

public class GirlFriend {

	private Temper temper;

	private BoyFriend boyFriend;

	public void setBoyFriend(BoyFriend boyFriend) {
		this.boyFriend = boyFriend;
	}

	public Temper getTemper() {
		return temper;
	}

	public void setTemper(Temper temper) {
		this.temper = temper;
		boyFriend.react(getTemper());
	}

}
