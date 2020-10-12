package design.patterns.p08.flyweight.p02;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BusinessTest {

	public static void main(String[] args) throws InterruptedException {
		MotorVehicleRentalCompany company = new MotorVehicleRentalCompany();
		company.startBusiness();

		ExecutorService threadPool = Executors.newCachedThreadPool();
		Random random = new Random();
		for (int i = 0; i < 250; i++) {
			int r = random.nextInt(18);
			int range = r < 5 ? 0 : (r < 15 ? 1 : 2);
			switch (range) {
			case 0:
				threadPool.execute(new BorrowMotorVehicle<Car>(random, company, Type.CAR));
				break;
			case 1:
				threadPool.execute(new BorrowMotorVehicle<MotorBike>(random, company, Type.MOTORBIKE));
				break;
			case 2:
				threadPool.execute(new BorrowMotorVehicle<Truck>(random, company, Type.TRUCK));
				break;
			default:
				break;
			}
		}

		threadPool.shutdown();
		for (; !threadPool.awaitTermination(500, TimeUnit.MILLISECONDS);)
			;
	}

}
