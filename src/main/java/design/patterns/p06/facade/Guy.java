package design.patterns.p06.facade;

public class Guy {

	Heart heart;

	Kidney kidney;

	Lung lung;

	public Guy() {
		super();
		this.heart = new Heart();
		this.kidney = new Kidney();
		this.lung = new Lung();
	}

	public void die() {
		System.out.println("I will be a dead body soon......");
		System.out.println("==============================");
		heart.die();
		kidney.die();
		lung.die();
	}

	public void revive() {
		heart.revive();
		kidney.revive();
		lung.revive();
		System.out.println("==============================");
		System.out.println("I've got a new life!");
	}

}
