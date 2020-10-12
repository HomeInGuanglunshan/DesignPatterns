package design.patterns.p02.builder.newway;

import java.util.List;

public class Farm {

	List<String> poultry;

	List<String> livestock;

	List<String> tree;

	List<String> vegetable;

	List<String> grain;

	List<String> pet;

	public Farm() {
		throw new RuntimeException("Can not init here");
	}

	private Farm(Builder builder) {
		this.poultry = builder.poultry;
		this.livestock = builder.livestock;
		this.tree = builder.tree;
		this.vegetable = builder.vegetable;
		this.grain = builder.grain;
		this.pet = builder.pet;
	}

	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "Our farm has [poultry=" + poultry + ", livestock=" + livestock + ", tree=" + tree + ", vegetable="
				+ vegetable + ", grain=" + grain + ", pet=" + pet + "]";
	}

	public static final class Builder {

		List<String> poultry;

		List<String> livestock;

		List<String> tree;

		List<String> vegetable;

		List<String> grain;

		List<String> pet;

		public Builder() {
		}

		Builder poultry(List<String> poultry) {
			this.poultry = poultry;
			return this;
		}

		Builder livestock(List<String> livestock) {
			this.livestock = livestock;
			return this;
		}

		Builder tree(List<String> tree) {
			this.tree = tree;
			return this;
		}

		Builder vegetable(List<String> vegetable) {
			this.vegetable = vegetable;
			return this;
		}

		Builder grain(List<String> grain) {
			this.grain = grain;
			return this;
		}

		Builder pet(List<String> pet) {
			this.pet = pet;
			return this;
		}

		public Farm build() {
			return new Farm(this);
		}

	}

}
