package design.patterns.p06.facade;

public class FacadeTest {

	public static void main(String[] args) {
		Guy guy = new Guy();
		guy.die();
		guy.revive();
	}

}
