package design.patterns.p10.observer.p03;

import java.util.ArrayList;
import java.util.List;

public class Qinsmoon {

	List<Fan> fans = new ArrayList<Fan>();

	public void addFans(Fan fan) {
		fans.add(fan);
	}

	public void update(String content) {
		System.out.println(new StringBuilder().append("秦时明月更新了：").append(content));
		notifyFans(content);
	}

	public void notifyFans(String content) {
		for (Fan fan : fans) {
			fan.commment(content);
		}
	}

}
