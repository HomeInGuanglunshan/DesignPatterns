package design.patterns.p17.mediator.p05;

import java.util.ArrayList;
import java.util.List;

public abstract class Matchmaker {

	List<BlindDater> boys = new ArrayList<>();

	List<BlindDater> girls = new ArrayList<>();

	public void register(BlindDater blindDater) {
		if (blindDater instanceof Boy) {
			boys.add(blindDater);
		} else if (blindDater instanceof Girl) {
			girls.add(blindDater);
		}
	}

	public abstract void match();

}
