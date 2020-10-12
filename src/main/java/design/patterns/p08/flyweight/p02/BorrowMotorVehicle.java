package design.patterns.p08.flyweight.p02;

import java.util.Random;

public class BorrowMotorVehicle<T extends MotorVehicle> implements Runnable {

	Random random;

	MotorVehicleRentalCompany company;

	Type type;

	public BorrowMotorVehicle(Random random, MotorVehicleRentalCompany company, Type type) {
		super();
		this.random = random;
		this.company = company;
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		T vehicle = null;
		for (; null == (vehicle = (T) company.rent(type));) {
			System.err.println(Thread.currentThread().getName() + " is waiting for a " + type + "......");
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		vehicle.run(Thread.currentThread().getName(), random.nextInt(5000));
		company.endRental(type, vehicle);
	}

}