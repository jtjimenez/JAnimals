package jek.actions;

public interface Swimmer {
	default String swim() {
		String swim = this.getClass().getSimpleName() + " is swimming";
		System.out.println(swim);
		return swim;
	}
}
