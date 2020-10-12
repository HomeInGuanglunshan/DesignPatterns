package design.patterns.p02.builder.newway;

import java.util.Arrays;

public class FarmTest {

	public static void main(String[] args) {
		Farm farm = new Farm.Builder().poultry(Arrays.asList("hen", "chicken", "duck", "rooster"))
				.livestock(Arrays.asList("cow", "sheet")).tree(Arrays.asList("apple tree", "lemon tree"))
				.vegetable(Arrays.asList("patato", "tomato")).grain(Arrays.asList("rice", "wheat"))
				.pet(Arrays.asList("dog", "cat")).build();
		Farm farm2 = Farm.builder().poultry(Arrays.asList("goose", "turkey")).livestock(Arrays.asList("goat", "cattle"))
				.tree(Arrays.asList("pear tree", "orange tree")).vegetable(Arrays.asList("onion", "cabbage"))
				.grain(Arrays.asList("sorghum", "soybean")).pet(Arrays.asList("parrot")).build();
		System.out.println(farm);
		System.out.println(farm2);
	}

}
