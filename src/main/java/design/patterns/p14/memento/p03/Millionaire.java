package design.patterns.p14.memento.p03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 答对了，下一题；答错了，上一题
 */
public class Millionaire {

	public static void main(String[] args) throws Exception {
		ChenQitai chen = new ChenQitai();
		QuetionBank bank = new QuetionBank();

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		for (int i = 1;;) {
			Quetion quetion;
			if (i > bank.getCapacity()) {
				quetion = chen.askQuetion();
				bank.addQuetion(i, quetion);
			} else {
				quetion = chen.reaskQuetion(bank.getQuetion(i));
			}
			System.out.println(quetion);

			String input = bufferedReader.readLine();
			if (quetion.getAnswer().equals(Integer.valueOf(input))) {
				i++;
			} else {
				i = i - 1 < 1 ? 1 : --i;
			}
		}
	}

}
