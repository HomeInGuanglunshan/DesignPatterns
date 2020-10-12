package design.patterns.p07.bridge.p02;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VideoRoom {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		List<String> fileType = Arrays.asList("AVI", "MPEG", "RMVB", "WMV");
		List<String> osType = Arrays.asList("Windows", "Unix", "Linux", "MacOS");
		List<String> studyMaterial = Arrays.asList("[无码]G罩杯鲸鱼喷水母鲸(大塚咲)", "【enjoy丶】【SEX8.cc】年轻后母的肉欲诱惑 希崎ジェシカ",
				"三里屯优衣库试衣间视频【xunleicang.cc】", "259LUXU-1069 ラグジュTV 1046");
		String packageName = VideoRoom.class.getPackage().getName();
		Random random = new Random();
		VedioFile vedioFile = (VedioFile) Class.forName(new StringBuilder().append(packageName).append(".")
				.append(fileType.get(random.nextInt(fileType.size()))).append("File").toString()).newInstance();
		OperatingSystemVersion operatingSystemVersion = (OperatingSystemVersion) Class
				.forName(new StringBuilder().append(packageName).append(".")
						.append(osType.get(random.nextInt(osType.size()))).append("Version").toString())
				.newInstance();

		operatingSystemVersion.setVedioFile(vedioFile);
		operatingSystemVersion.play(studyMaterial.get(random.nextInt(studyMaterial.size())));
	}

}
