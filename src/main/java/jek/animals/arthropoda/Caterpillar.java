package jek.animals.arthropoda;

import jek.actions.Metamorphoser;
import jek.actions.Walker;

public class Caterpillar extends Arthropods implements Walker, Metamorphoser<Butterfly> {

	@Override
	public Butterfly morph() {
		return new Butterfly();
	}

}
