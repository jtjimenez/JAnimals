package jek.actions;

public interface Singer {
	default void sing() {
		System.out.println(this.getClass().getSimpleName() + " is singing");
	}
}
