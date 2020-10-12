package design.patterns.p08.flyweight.p02;

public class MotorBike extends MotorVehicle {

	@Override
	public void run(String tenant, int duration) {
		System.out.println(
				"Rider " + tenant + ", please wear the helmet during your riding within " + duration + " millis......");
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
