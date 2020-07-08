package jek.animals.chordata.mammalia;

import jek.actions.Sounder;
import jek.actions.Swimmer;

public class Dolphin extends Mammal implements Swimmer, Sounder {

	@Override
	public String makeSound() {
		return null;
	}

}
