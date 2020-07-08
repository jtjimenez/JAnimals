package jek.animals.arthropoda;

import jek.actions.Flyer;
import jek.animals.ResourceLoader;

public class Butterfly extends Arthropods implements Flyer {

	@Override
	public void fly() {
		System.out.println(ResourceLoader.get("fly.butterfly"));
	}

}
