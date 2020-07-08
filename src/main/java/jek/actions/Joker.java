package jek.actions;

public interface Joker {
	default String makeJoke() {
		String joke = this.getClass().getSimpleName() + " makes a joke";
		System.out.println(joke);
		return joke;
	}
}
