package jek.animals.chordata.mammalia;

import jek.actions.Sounder;
import jek.actions.Swimmer;
import jek.actions.Walker;
import jek.animals.ResourceLoader;

public class Dog extends Mammal implements Walker, Sounder, Swimmer {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		System.out.println(ResourceLoader.get("makesound.dog"));
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

}
