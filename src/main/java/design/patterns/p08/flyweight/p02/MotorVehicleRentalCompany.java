package design.patterns.p08.flyweight.p02;

import java.util.HashMap;
import java.util.Map;

public class MotorVehicleRentalCompany {

	Map<Type, Garage<? extends MotorVehicle>> map;

	public void startBusiness() {
		map = new HashMap<>();
		map.put(Type.CAR, new Garage<Car>("Car Garage", 50, Car.class));
		map.put(Type.MOTORBIKE, new Garage<MotorBike>("Motorbike Garage", 100, MotorBike.class));
		map.put(Type.TRUCK, new Garage<Truck>("Truck Garage", 30, Truck.class));
	}

	public MotorVehicle rent(Type type) {
		Garage<? extends MotorVehicle> garage = map.get(type);
		return garage.getMotorVehicle();
	}

	public void endRental(Type type, MotorVehicle vehicle) {
		Garage<? extends MotorVehicle> garage = map.get(type);
		garage.returnMotorVehicle(vehicle);
	}

}
