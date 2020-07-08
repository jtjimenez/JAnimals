package jek.animals.chordata.aves;

import jek.actions.Flyer;
import jek.actions.Sounder;
import jek.actions.Walker;

public class Parrot extends Bird implements Sounder, Flyer, Walker {

	private Class<?> soundModel;

	public Parrot() {
		
	}

	public Parrot(Class<?> soundModel) {
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
	public void makeSound() {
		try {
			// Assuming all other types of animals make same sounds
			if (soundModel == null) {
				System.out.println("<This parrot did not hear and make any sound>");
				return;
			}
			Object object = soundModel.newInstance();
			if (object instanceof Sounder) {
				Sounder sounder = (Sounder) object;
				sounder.makeSound();
			} else {
				System.out.println("<This parrot did not hear and make any sound>");
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
