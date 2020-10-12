package design.patterns.p07.bridge.p02;

public abstract class OperatingSystemVersion {

	VedioFile vedioFile;

	public void setVedioFile(VedioFile vedioFile) {
		this.vedioFile = vedioFile;
	}

	public abstract void play(String fileName);

}
