package design.patterns.p12.chain.of.responsibility.p04;

public class Patient {

	private String name;

	private int severity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public Patient(String name, int severity) {
		super();
		this.name = name;
		this.severity = severity;
	}

	@Override
	public String toString() {
		return name;
	}

}
