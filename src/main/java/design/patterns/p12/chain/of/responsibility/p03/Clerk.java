package design.patterns.p12.chain.of.responsibility.p03;

class Clerk extends AbstractClerk {
	public Clerk() {
		super.type = "职员";
	}

	@Override
	public int getLimit() {
		return 5000;
	}
}

class Leader extends AbstractClerk {
	public Leader() {
		super.type = "组长";
	}

	@Override
	public int getLimit() {
		return 20000;
	}
}

class Manager extends AbstractClerk {
	public Manager() {
		super.type = "经理";
	}

	@Override
	public int getLimit() {
		return 100000;
	}
}