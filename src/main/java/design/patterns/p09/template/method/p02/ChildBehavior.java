package design.patterns.p09.template.method.p02;

public enum ChildBehavior {

	doWhat(ChildBehavior.class.getResource("doWhat-Child.txt").getFile()),

	how(ChildBehavior.class.getResource("how-Child.txt").getFile()),

	when(ChildBehavior.class.getResource("when-Child.txt").getFile()),

	where(ChildBehavior.class.getResource("where-Child.txt").getFile()),

	who(ChildBehavior.class.getResource("who-Child.txt").getFile());

	String path;

	private ChildBehavior(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

}
