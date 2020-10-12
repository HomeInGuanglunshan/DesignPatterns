package design.patterns.p02.builder.oldway1;

public class ArtificialBeautyBuilderTest {

	public static void main(String[] args) {
		Diretor diretor = new Diretor(new AuntBuilder());
		System.out.println(diretor.construct());

		Diretor diretor2 = new Diretor(new GirlBuilder());
		System.out.println(diretor2.construct());
	}

}
