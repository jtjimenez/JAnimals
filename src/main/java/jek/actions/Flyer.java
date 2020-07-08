package jek.actions;

public interface Flyer {
	default void fly() {
		System.out.println(this.getClass().getSimpleName() + " is flying");
	}
}
