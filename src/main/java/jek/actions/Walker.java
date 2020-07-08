package jek.actions;

import jek.animals.ResourceLoader;

public interface Walker {
	default void walk() {
		System.out.println(String.format(ResourceLoader.get("walk"), this.getClass().getSimpleName()));
	}
}
