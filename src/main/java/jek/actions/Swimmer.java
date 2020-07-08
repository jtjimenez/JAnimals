package jek.actions;

public interface Swimmer {
	default void swim() {
		System.out.println(this.getClass().getSimpleName() + " is swimming");
	}
}
