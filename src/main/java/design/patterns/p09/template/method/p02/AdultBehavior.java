package design.patterns.p09.template.method.p02;

public enum AdultBehavior {

	doWhat(AdultBehavior.class.getResource("doWhat-Adult.txt").getFile()),

	how(AdultBehavior.class.getResource("how-Adult.txt").getFile()),

	when(AdultBehavior.class.getResource("when-Adult.txt").getFile()),

	where(AdultBehavior.class.getResource("where-Adult.txt").getFile()),

	who(AdultBehavior.class.getResource("who-Adult.txt").getFile());

	String path;

	private AdultBehavior(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

}
