package jek.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.Test;

import jek.animals.Animal;
import jek.animals.ResourceLoader;
import jek.animals.arthropoda.Butterfly;
import jek.animals.arthropoda.Caterpillar;
import jek.animals.chordata.aves.Bird;
import jek.animals.chordata.aves.Chicken;
import jek.animals.chordata.aves.Duck;
import jek.animals.chordata.aves.Parrot;
import jek.animals.chordata.fish.Clownfish;
import jek.animals.chordata.fish.Fish;
import jek.animals.chordata.fish.Shark;
import jek.animals.chordata.mammalia.Cat;
import jek.animals.chordata.mammalia.Dog;
import jek.animals.chordata.mammalia.Dolphin;
import jek.enums.Gender;
import jek.util.AnimalCounter;

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

	// B - 2
	@Test
	public void testSharkFish() {
		Shark shark = new Shark();
		Clownfish clownfish = new Clownfish();

		assertEquals("large", shark.getSizeClass());
		assertEquals("grey", shark.getColorScheme());
		assertEquals("small", clownfish.getSizeClass());
		assertEquals("colourful (orange)", clownfish.getColorScheme());
		Fish fish = new Fish();
		assertEquals("Shark eats Fish", shark.consume(fish));
		assertEquals("Shark eats Clownfish", shark.consume(clownfish));
	}

	// B - 3
	@Test
	public void testDolphin() {
		Dolphin dolphin = new Dolphin();
		assertEquals("Dolphin is swimming", dolphin.swim());
	}

	// D - 1
	@Test
	public void testButterfly() {
		Butterfly butterfly = new Butterfly();
		assertEquals("Butterfly is flying", butterfly.fly());
	}

	// D - 2
	@Test
	public void testCatterpillar() {
		Caterpillar caterpillar = new Caterpillar();
		assertEquals("Caterpillar is crawling", caterpillar.walk());
		assertTrue(caterpillar.morph() instanceof Butterfly);
	}

	// E - 1
	@Test
	public void testCounter() {
		Animal[] animalList = new Animal[] { new Bird(), new Duck(), new Dolphin(), new Dog(), new Cat(), new Parrot(),
				new Chicken(), new Butterfly() };

		// how to check if can fly, walk, sing or swim
		assertEquals(2, AnimalCounter.getFlyerCount(animalList));
		assertEquals(6, AnimalCounter.getWalkerCount(animalList));
		assertEquals(4, AnimalCounter.getSingerCount(animalList));
		assertEquals(2, AnimalCounter.getSwimmerCount(animalList));
	}

	// BONUS - 1
	@Test
	public void testL10n() {
		Dog dog = new Dog();
		ResourceLoader.loadResourceBundle(Locale.FRENCH);
		assertEquals("Wouf, wouf", dog.makeSound());
		ResourceLoader.loadResourceBundle(Locale.ENGLISH);
		assertEquals("Woof, woof", dog.makeSound());
	}
}
