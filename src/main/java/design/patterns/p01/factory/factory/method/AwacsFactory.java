package design.patterns.p01.factory.factory.method;

import design.patterns.p01.factory.entity.Awacs;
import design.patterns.p01.factory.entity.Plane;

public class AwacsFactory implements PlaneFactory {

	@Override
	public Plane getPlane() {
		return new Awacs();
	}

}
