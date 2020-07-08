package jek.animals.arthropoda;

import jek.actions.Metamorphoser;
import jek.actions.Walker;

public class Caterpillar extends Arthropods implements Walker, Metamorphoser<Butterfly> {

	@Override
	public Butterfly morph() {
		return new Butterfly();
	}

	@Override
	public String walk() {
		String walk = "Caterpillar is crawling";
		System.out.println(walk);
		return walk;
	}
}
