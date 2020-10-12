package design.patterns.p08.flyweight.p02;

import java.util.Vector;

public class Garage<T extends MotorVehicle> {

	String name;

	int size;

	Class<T> motorVehicleType;

	Vector<MotorVehicle> stock;

	public Garage(String name, int size, Class<T> motorVehicleType) {
		super();
		this.name = name;
		this.size = size;
		this.motorVehicleType = motorVehicleType;
		stockUp();
	}

	public void stockUp() {
		stock = new Vector<>(size);
		for (int i = 0; i < size; i++) {
			try {
				stock.add(motorVehicleType.newInstance());
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	public MotorVehicle getMotorVehicle() {
		if (stock.size() > 0) {
			MotorVehicle vehicle = stock.get(0);
			stock.remove(vehicle);
			return vehicle;
		} else {
			return null;
		}
	}

	public void returnMotorVehicle(MotorVehicle motorVehicle) {
		stock.add(motorVehicle);
	}

}
