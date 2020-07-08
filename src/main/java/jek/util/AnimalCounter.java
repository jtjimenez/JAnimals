package jek.util;

import jek.actions.Flyer;
import jek.actions.Singer;
import jek.actions.Swimmer;
import jek.actions.Walker;
import jek.animals.Animal;

public class AnimalCounter {
	private AnimalCounter() {
	}

	public static int getFlyerCount(Animal[] animalList) {
		int count = 0;
		for (Animal animal : animalList) {
			if (animal instanceof Flyer) {
				count++;
			}
		}
		return count;
	}

	public static int getWalkerCount(Animal[] animalList) {
		int count = 0;
		for (Animal animal : animalList) {
			if (animal instanceof Walker) {
				count++;
			}
		}
		return count;
	}

	public static int getSingerCount(Animal[] animalList) {
		int count = 0;
		for (Animal animal : animalList) {
			if (animal instanceof Singer) {
				count++;
			}
		}
		return count;
	}

	public static int getSwimmerCount(Animal[] animalList) {
		int count = 0;
		for (Animal animal : animalList) {
			if (animal instanceof Swimmer) {
				count++;
			}
		}
		return count;
	}
}
