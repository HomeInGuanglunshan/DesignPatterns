package design.patterns.p01.factory.factory.method;

import design.patterns.p01.factory.entity.Bomber;
import design.patterns.p01.factory.entity.Plane;

public class BomberFactory implements PlaneFactory {

	@Override
	public Plane getPlane() {
		return new Bomber();
	}

}
