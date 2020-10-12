package design.patterns.p17.mediator.p05;

import java.util.List;

public class YangZedu extends Boy {

	@Override
	public boolean accept(List<Requirement> requirements) {
		if (requirements.contains(Requirement.HEIGHT)) {
			return false;
		}
		if (requirements.contains(Requirement.HOUSE)) {
			return false;
		}
		if (requirements.contains(Requirement.CAR)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "杨泽杜";
	}

}
