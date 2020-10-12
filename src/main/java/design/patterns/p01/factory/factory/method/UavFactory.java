package design.patterns.p01.factory.factory.method;

import design.patterns.p01.factory.entity.Plane;
import design.patterns.p01.factory.entity.Uav;

public class UavFactory implements PlaneFactory {

	@Override
	public Plane getPlane() {
		return new Uav();
	}

}
