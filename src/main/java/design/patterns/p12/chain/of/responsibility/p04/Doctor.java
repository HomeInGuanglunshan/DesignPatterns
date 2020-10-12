package design.patterns.p12.chain.of.responsibility.p04;

public class Doctor {

	private Doctor betterDoctor;

	public void setBetterDoctor(Doctor betterDoctor) {
		this.betterDoctor = betterDoctor;
	}

	private String name;

	private int medicalSkill;

	public Doctor(String name, int medicalSkill) {
		this.name = name;
		this.medicalSkill = medicalSkill;
	}

	public void heal(Patient patient) {
		if (this.medicalSkill >= patient.getSeverity()) {
			System.out.println(this + "医治好了" + patient);
			return;
		}
		if (betterDoctor == null) {
			System.out.println(this + "表示" + patient + "无药可救，等死吧");
			return;
		}
		System.out.println(this + "无法医治" + patient + "， 求助" + betterDoctor);
		betterDoctor.heal(patient);
	}

	@Override
	public String toString() {
		return name;
	}

}
