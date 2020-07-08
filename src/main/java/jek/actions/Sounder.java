package jek.actions;

import jek.animals.ResourceLoader;

public interface Sounder {
	default String makeSound() {
		String sound = ResourceLoader.get("makesound." + this.getClass().getSimpleName());
		System.out.println(sound);
		return sound;
	}
}
