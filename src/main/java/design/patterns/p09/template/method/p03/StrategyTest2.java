package design.patterns.p09.template.method.p03;

public class StrategyTest2 {

	public static void main(String[] args) {
		String exp = "99+77";
		Plus cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
