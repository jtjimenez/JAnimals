package jek.actions;

public interface Singer {
	default String sing() {
		String song = this.getClass().getSimpleName() + " is singing";
		System.out.println(song);
		return song;
	}
}
