package design.patterns.p09.template.method.p01;

public class Test {

	public static void main(String[] args) {
		//我不放油
		MeCook myCook = new MeCook();
		myCook.setIsAddOil(false);
		myCook.cook();

		//大厨做饭放油是默认的，不用指定
		Cook chefCook = new ChefCook();
		chefCook.cook();
	}

}
