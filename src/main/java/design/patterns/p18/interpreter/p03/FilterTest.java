package design.patterns.p18.interpreter.p03;

public class FilterTest {

	public static void main(String[] args) {
		Filter<Integer> digitFilter = new DigitFilter();
		Filter<Character> letterFilter = new LetterFilter();
		System.out.println(digitFilter.filter("aogy35h43agada"));
		System.out.println(letterFilter.filter("aogy35h43agada"));
		System.out.println(digitFilter.filter("7hk5h72h5lkh46"));
		System.out.println(letterFilter.filter("7hk5h72h5lkh46"));
	}

}
