package design.patterns.p18.interpreter.p03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) throws Exception {
//		Matcher matcher = Pattern.compile("\\d").matcher("5hk234h66");
		Matcher matcher = Pattern.compile("(\\d)\\d").matcher("5hk234h66");
		while (matcher.find()) {
//			System.out.println(matcher.group(1));
			System.out.println(matcher.group());
		}
	}

}
