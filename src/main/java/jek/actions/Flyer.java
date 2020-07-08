package jek.actions;

public interface Flyer {
	default String fly() {
		String fly = this.getClass().getSimpleName() + " is flying";
		System.out.println(fly);
		return fly;
	}
}
