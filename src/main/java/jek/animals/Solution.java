package jek.animals;

import java.util.Locale;

import jek.actions.Flyer;
import jek.actions.Singer;
import jek.actions.Swimmer;
import jek.actions.Walker;
import jek.animals.arthropoda.Butterfly;
import jek.animals.arthropoda.Caterpillar;
import jek.animals.chordata.aves.Bird;
import jek.animals.chordata.aves.Chicken;
import jek.animals.chordata.aves.Duck;
import jek.animals.chordata.aves.Parrot;
import jek.animals.chordata.mammalia.Cat;
import jek.animals.chordata.mammalia.Dog;
import jek.animals.chordata.mammalia.Dolphin;

public class Solution {

	public static void main(String... args) {

		// Here can set the language to be used
		// see resource files
		ResourceLoader.loadResourceBundle(Locale.ENGLISH);
		new Butterfly().fly();

		Animal[] animalList = new Animal[] { new Bird(), new Duck(), new Dolphin(), new Dog(), new Cat(), new Parrot(),
				new Chicken(), new Butterfly() };

		// how to check if can fly, walk, sing or swim
		System.out.println("Can fly: " + getFlyerCount(animalList));
		System.out.println("Can walk: " + getWalkerCount(animalList));
		System.out.println("Can sing: " + getSingerCount(animalList));
		System.out.println("Can swim: " + getSwimmerCount(animalList));

		// parrot is able to store a model class/animal which will determine the sound itself makes
		System.out.print("The parrot lives near a dog and says ");
		new Parrot(new Dog()).makeSound();
		System.out.print("The parrot says ");
		new Parrot().makeSound();

		// caterpillar morphs into a butterfly
		Caterpillar cat = new Caterpillar();
		cat.walk();
		Butterfly butterfly = cat.morph();
		butterfly.fly();
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
