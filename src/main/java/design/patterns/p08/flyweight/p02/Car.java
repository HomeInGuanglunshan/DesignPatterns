package design.patterns.p08.flyweight.p02;

public class Car extends MotorVehicle {

	@Override
	public void run(String tenant, int duration) {
		System.out.println("The car borrowed by " + tenant + " runs on 4 wheels within " + duration + " millis......");
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
