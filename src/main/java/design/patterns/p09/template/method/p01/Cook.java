package design.patterns.p09.template.method.p01;

public abstract class Cook {

	// 放油
	public abstract void oil();

	// 放鸡蛋
	public abstract void egg();

	//  放西红柿
	public abstract void tomato();

	// 钩子方法:让子类决定是否加油
	public boolean isAddOil() {
		return true;
	}

	// 把做饭的方法封装起来
	final public void cook() {
		this.egg();
		this.tomato();
		// 如果子类决定添加:则执行添加油的方法
		if (this.isAddOil()) {
			this.oil();
		}
	}

}
