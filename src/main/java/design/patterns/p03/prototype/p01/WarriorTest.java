package design.patterns.p03.prototype.p01;

public class WarriorTest {

	public static void main(String[] args) throws Exception {
		Sword sword = new Sword("绝世好剑");
		Warrior BuJingyun = new Warrior(sword, "步惊云");
		Warrior fake = (Warrior) BuJingyun.clone();
		System.out.println(BuJingyun);
		System.out.println(fake);
		System.out.println("------------------------------");
		sword.setName("大宝剑");
		System.out.println(BuJingyun);
		System.out.println(fake);
	}

}
