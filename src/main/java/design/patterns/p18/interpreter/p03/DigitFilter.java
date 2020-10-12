package design.patterns.p18.interpreter.p03;

import java.util.ArrayList;
import java.util.List;

public class DigitFilter implements Filter<Integer> {

	@Override
	public List<Integer> filter(String str) {
		List<Integer> list = new ArrayList<Integer>();
		for (char c : str.toCharArray()) {
			if (c >= 48 && c <= 57) {
				list.add(Integer.valueOf(String.valueOf(c)));
			}
		}
		return list;
	}

}
