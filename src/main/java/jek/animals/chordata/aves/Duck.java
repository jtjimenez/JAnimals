package jek.animals.chordata.aves;

import jek.actions.Sounder;
import jek.animals.ResourceLoader;

public class Duck extends Bird implements Sounder {

	@Override
	public String makeSound() {
		String sound = ResourceLoader.get("makesound.Duck");
		System.out.println(sound);
		return sound;
	}

}
