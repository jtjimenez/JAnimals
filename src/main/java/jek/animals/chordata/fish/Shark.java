package jek.animals.chordata.fish;

import jek.actions.Eater;

public class Shark extends Fish implements Eater<Fish> {
	public Shark() {
		this.sizeClass = "large";
		this.colorScheme = "grey";
	}
}
