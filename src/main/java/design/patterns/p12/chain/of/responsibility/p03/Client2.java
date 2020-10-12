package design.patterns.p12.chain.of.responsibility.p03;

class Boss extends AbstractClerk {
	public Boss() {
		super.type = "老板";
	}

	@Override
	public int getLimit() {
		return 1000000;
	}
}

public class Client2 {
	public static void main(String[] args) {
		AbstractClerk clerk = new Clerk();
		AbstractClerk leader = new Leader();
		AbstractClerk manager = new Manager();
		AbstractClerk boss = new Boss();

		clerk.setSuperior(leader);
		leader.setSuperior(manager);
		manager.setSuperior(boss);

		//有人借款 10000 元
		clerk.approveRequest(new BorrowRequest(10000));

		//有人借款 111000 元
		clerk.approveRequest(new BorrowRequest(111000));

	}
}
