package design.patterns.p18.interpreter.p03;

import java.util.ArrayList;
import java.util.List;

public class LetterFilter implements Filter<Character> {

	@Override
	public List<Character> filter(String str) {
		List<Character> list = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				list.add(c);
			}
		}
		return list;
	}

}
