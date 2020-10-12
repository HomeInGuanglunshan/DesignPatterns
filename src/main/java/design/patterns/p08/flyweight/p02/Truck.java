package design.patterns.p08.flyweight.p02;

public class Truck extends MotorVehicle {

	@Override
	public void run(String tenant, int duration) {
		System.out.println(tenant + " will carry these goods by truck and you can got them in " + duration + " millis");
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
