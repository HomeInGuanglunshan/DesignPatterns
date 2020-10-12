package design.patterns.p07.bridge.p02;

public class WindowsVersion extends OperatingSystemVersion {

	@Override
	public void play(String fileName) {
		this.vedioFile.decode("Windows", fileName);
	}

}
