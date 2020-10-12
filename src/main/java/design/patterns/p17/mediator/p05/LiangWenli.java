package design.patterns.p17.mediator.p05;

import java.util.Arrays;
import java.util.List;

public class LiangWenli extends Girl {

	@Override
	public List<Requirement> require() {
		return Arrays.asList(Requirement.HOUSE, Requirement.CAR);
	}

	@Override
	public String toString() {
		return "梁文丽";
	}

}
