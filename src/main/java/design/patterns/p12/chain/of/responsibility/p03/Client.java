package design.patterns.p12.chain.of.responsibility.p03;

public class Client {
	public static void main(String[] args) {
		AbstractClerk clerk = new Clerk();
		AbstractClerk leader = new Leader();
		AbstractClerk manager = new Manager();

		clerk.setSuperior(leader);
		leader.setSuperior(manager);

		//有人借款 10000 元
		clerk.approveRequest(new BorrowRequest(10000));

		//有人借款 111000 元
		clerk.approveRequest(new BorrowRequest(111000));

	}
}
