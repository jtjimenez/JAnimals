package jek.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jek.animals.chordata.aves.Bird;
import jek.animals.chordata.aves.Chicken;
import jek.animals.chordata.aves.Duck;
import jek.animals.chordata.aves.Parrot;
import jek.animals.chordata.fish.Fish;
import jek.animals.chordata.mammalia.Cat;
import jek.animals.chordata.mammalia.Dog;
import jek.enums.Gender;

public class JAnimalsTest {

	// A - 1
	@Test
	public void testSing() {
		System.out.println("Bird Sing Test");
		Bird bird = new Bird();
		assertEquals("Bird is singing", bird.sing());
	}

	// A - 2 & 3
	@Test
	public void testChickenDuck() {
		System.out.println("Chicken/Duck Test");

		Chicken chicken = new Chicken(Gender.FEMALE);
		assertEquals("Cluck, cluck", chicken.makeSound());
		chicken = new Chicken(Gender.MALE);
		assertEquals("Cock-a-doodle-doo", chicken.makeSound());

		Duck duck = new Duck();
		assertEquals("Quack, quack", duck.makeSound());
	}

	// A - 4
	@Test
	public void testParrot() {
		System.out.print("The parrot lives near a dog and says ");
		assertEquals("Woof, woof", new Parrot(new Dog()).makeSound());
		System.out.print("The parrot lives near a cat and says ");
		assertEquals("Meow", new Parrot(new Cat()).makeSound());
		System.out.print("The parrot lives near a rooster and says ");
		assertEquals("Cock-a-doodle-doo", new Parrot(new Chicken(Gender.MALE)).makeSound());
		System.out.print("The parrot says ");
		new Parrot().makeSound();
	}

	// B - 1
	@Test
	public void testFish() {
		Fish fish = new Fish();
		assertEquals("Fish is swimming", fish.swim());
	}
}
