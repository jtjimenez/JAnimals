package jek.actions;

public interface Walker {
	default String walk() {
		String walk = this.getClass().getSimpleName() + " is walking";
		System.out.println(walk);
		return walk;
	}
}
