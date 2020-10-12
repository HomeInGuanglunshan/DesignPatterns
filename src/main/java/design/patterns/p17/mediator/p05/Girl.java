package design.patterns.p17.mediator.p05;

import java.util.List;

public abstract class Girl implements BlindDater {

	@Override
	public boolean accept(List<Requirement> requirements) {
		return false;
	}

}
