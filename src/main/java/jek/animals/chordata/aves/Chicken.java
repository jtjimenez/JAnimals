package jek.animals.chordata.aves;

import jek.actions.Sounder;
import jek.animals.ResourceLoader;
import jek.enums.Gender;

public class Chicken extends Bird implements Sounder {

	public Chicken() {

	}

	public Chicken(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String makeSound() {
		String sound;
		if (gender != null && Gender.MALE.equals(gender)) {
			sound = ResourceLoader.get("makesound.Chicken.m");
		} else {
			sound = ResourceLoader.get("makesound.Chicken.f");
		}
		System.out.println(sound);
		return sound;
	}

}
