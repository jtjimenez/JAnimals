package jek.actions;

public interface Eater<T> {
	default String consume(T food) {
		String eat = this.getClass().getSimpleName() + " eats " + food.getClass().getSimpleName();
		System.out.println(eat);
		return eat;
	}
}
