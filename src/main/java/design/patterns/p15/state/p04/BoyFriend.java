package design.patterns.p15.state.p04;

public class BoyFriend {

	public void chase(GirlFriend girlFriend) {
		girlFriend.setBoyFriend(this);
	}

	public void react(Temper temper) {
		switch (temper) {
		case ANGRY:
			System.out.println("It's my fault...sorry");
			break;
		case HAPPY:
			System.out.println("Why not go out and have a fun?");
			break;
		case SAD:
			System.out.println("Just cry in my arms");
			break;
		case UPSET:
			System.out.println("Don't worry, there is nothing");
			break;
		case LUSTFUL:
			System.out.println("Fuck you!");
			break;
		default:
			System.out.println("Are you OK?");
			break;
		}
	}

}
