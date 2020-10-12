package design.patterns.p16.visitor.p05;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KnowledgeOcean {

	public static void main(String[] args) {
		List<Media> medias = Arrays.asList(new Internet(), new Game(), new Book());
		List<Student> students = Arrays.asList(new Pupil(), new MiddleSchoolStudent(), new Colleger());
		Random random = new Random();
		medias.get(random.nextInt(medias.size())).attract(students.get(random.nextInt(students.size())));
	}

}
