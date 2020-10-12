package design.patterns.p09.template.method.p01;

public class MeCook extends Cook {

	//默认添加油
	private boolean addOilFlag = true;

	//用户设置是否添加油
	public void setIsAddOil(boolean isAddOil) {
		addOilFlag = isAddOil;
	}

	//子类传递过来的命令决定
	@Override
	public boolean isAddOil() {
		return this.addOilFlag;
	}

	@Override
	public void oil() {
		System.out.println("自己:放十斤油");
	}

	@Override
	public void egg() {
		System.out.println("自己:放一个鸡蛋");
	}

	@Override
	public void tomato() {
		System.out.println("自己:放10个鸡蛋");
	}

}
