package design.patterns.p07.bridge.p02;

public class AVIFile implements VedioFile {

	@Override
	public void decode(String osType, String fileName) {
		System.out.println(new StringBuilder().append(osType).append(" is playing ").append(fileName).append(".avi"));
	}

}
