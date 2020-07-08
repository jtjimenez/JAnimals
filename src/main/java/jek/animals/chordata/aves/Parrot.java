package jek.animals.chordata.aves;

import jek.actions.Flyer;
import jek.actions.Sounder;
import jek.actions.Walker;

public class Parrot extends Bird implements Sounder, Flyer, Walker {

	private Sounder soundModel;

	public Parrot() {

	}

	public Parrot(Sounder soundModel) {
		this.soundModel = soundModel;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
	}

	@Override
	public String makeSound() {
		String sound = null;
		try {
			// Assuming all other types of animals make same sounds
			if (soundModel == null) {
				System.out.println("<This parrot did not hear and make any sound>");
				return null;
			}
			return soundModel.makeSound();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sound;
	}

}
