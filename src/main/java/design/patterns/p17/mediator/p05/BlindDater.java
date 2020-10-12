package design.patterns.p17.mediator.p05;

import java.util.List;

public interface BlindDater {

	List<Requirement> require();

	boolean accept(List<Requirement> requirements);

}
