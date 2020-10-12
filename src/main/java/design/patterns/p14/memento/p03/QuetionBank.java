package design.patterns.p14.memento.p03;

import java.util.LinkedHashMap;
import java.util.Map;

public class QuetionBank {

	Map<Integer, Quetion> map = new LinkedHashMap<>();

	public void addQuetion(Integer i, Quetion quetion) {
		map.put(i, quetion);
	}

	public Quetion getQuetion(Integer i) {
		return map.get(i);
	}

	public Integer getCapacity() {
		return map.size();
	}

}
