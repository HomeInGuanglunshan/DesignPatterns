package design.patterns.p17.mediator.p05;

import java.util.Arrays;
import java.util.List;

public class XiaoJiang extends Girl {

	@Override
	public List<Requirement> require() {
		return Arrays.asList(Requirement.COCK, Requirement.SALARY);
	}

	@Override
	public String toString() {
		return "小江";
	}

}
