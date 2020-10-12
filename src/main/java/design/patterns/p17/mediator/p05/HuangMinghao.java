package design.patterns.p17.mediator.p05;

import java.util.List;

public class HuangMinghao extends Boy {

	@Override
	public boolean accept(List<Requirement> requirements) {
		if (requirements.contains(Requirement.HEIGHT)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "黄明豪";
	}

}
