package design.patterns.p15.state.p04;

public class ParkTalk {

	public static void main(String[] args) {
		GirlFriend girlFriend = new GirlFriend();
		BoyFriend boyFriend = new BoyFriend();
		boyFriend.chase(girlFriend);

		girlFriend.setTemper(Temper.ANGRY);
		girlFriend.setTemper(Temper.HAPPY);
		girlFriend.setTemper(Temper.LUSTFUL);
		girlFriend.setTemper(Temper.SAD);
		girlFriend.setTemper(Temper.UPSET);
	}

}
