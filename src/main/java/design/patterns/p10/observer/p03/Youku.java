package design.patterns.p10.observer.p03;

public class Youku {

	public static void main(String[] args) {
		Qinsmoon qinsmoon = new Qinsmoon();

		new Fanatic("Lida", qinsmoon);
		new PasserBy("XuChuizhong", qinsmoon);
		new Blackener("YangZedu", qinsmoon);

		qinsmoon.update("第二部第17集夜尽天明");
		qinsmoon.update("第三部第3集鬼谷传人");
	}

}
