package design.patterns.p07.bridge.p02;

public class MacOSVersion extends OperatingSystemVersion {

	@Override
	public void play(String fileName) {
		this.vedioFile.decode("MacOS", fileName);
	}

}
