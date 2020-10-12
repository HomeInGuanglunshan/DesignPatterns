package design.patterns.p09.template.method.p02;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ThreadLocalRandom;

public abstract class SentenceMaker {

	public abstract String who();

	public abstract String when();

	public abstract String where();

	public abstract String how();

	public abstract String doWhat();

	public abstract void setKnowHow(boolean knowHow);

	boolean knowHow;

	public void makeSentence() {
		StringBuilder sb = new StringBuilder();
		sb.append(when()).append("，").append(who()).append(where());
		if (knowHow) {
			sb.append(how());
		}
		sb.append(doWhat());
		System.out.println(sb);
	}

	public String readRandomLine(String filePath) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(filePath, "rw");
			long randomLocation = ThreadLocalRandom.current().nextLong(raf.length());
			for (; randomLocation > 0 && raf.readByte() != '\n'; raf.seek(--randomLocation))
				;
			return new String(raf.readLine().getBytes("ISO-8859-1"), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} finally {
			try {
				if (null != raf) {
					raf.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
