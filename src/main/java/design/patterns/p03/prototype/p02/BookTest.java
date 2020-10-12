package design.patterns.p03.prototype.p02;

public class BookTest {

	public static void main(String[] args) throws Exception {
		Book book = new Book("《论演员的自我修养》");
		Bag ANTA = new Bag("ANTA", book);
		Bag pirate = (Bag) ANTA.clone();
		System.out.println(ANTA);
		System.out.println(pirate);
		System.out.println("------------------------------");
		book.setName("《毛泽东选集》");
		System.out.println(ANTA);
		System.out.println(pirate);
		System.out.println("------------------------------");
		Bag LiNing = new Bag("LiNing", book);
		Bag pirate2 = (Bag) LiNing.deeplyClone();
		System.out.println(LiNing);
		System.out.println(pirate2);
		System.out.println("------------------------------");
		book.setName("《红楼梦》");
		System.out.println(LiNing);
		System.out.println(pirate2);
	}

}
