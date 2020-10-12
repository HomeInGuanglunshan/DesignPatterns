package design.patterns.p01.factory.factory.method;

import design.patterns.p01.factory.entity.Fighter;
import design.patterns.p01.factory.entity.Plane;

public class FighterFactory implements PlaneFactory {

	@Override
	public Plane getPlane() {
		return new Fighter();
	}

}
