package design.patterns.p13.command.p04;

public class CrimeTest {

	public static void main(String[] args) {
		Yang yang = new Yang("杨泽杜");
		Chen chen = new Chen("陈鸿涛");
		Huang huang = new Huang("黄明豪");

		CrimeCompany company = new CrimeCompany();

		Rape rape = new Rape(yang, "母猪");
		company.assign(rape);

		Murder murder = new Murder(huang, "喜洋洋");
		company.assign(murder);

		Kidnap kidnap = new Kidnap(chen, "刘巧娇");
		company.assign(kidnap);

		Rape rape2 = new Rape(chen, "刘巧娇");
		company.assign(rape2);
	}

}
