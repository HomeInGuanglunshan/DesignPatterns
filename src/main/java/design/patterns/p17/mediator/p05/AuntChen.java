package design.patterns.p17.mediator.p05;

public class AuntChen extends Matchmaker {

	@Override
	public void match() {
		for (BlindDater boy : boys) {
			for (BlindDater girl : girls) {
				if (boy.accept(girl.require())) {
					System.out.println(this + "发现，" + boy + "愿意和" + girl + "进一步发展");
				}
			}
		}
	}

	@Override
	public String toString() {
		return "陈姨";
	}

}
