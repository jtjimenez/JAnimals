package jek.animals;

import jek.enums.Gender;

public abstract class Animal {

	protected String sizeClass;
	protected String colorScheme;
	protected Gender gender;

	public String getSizeClass() {
		return sizeClass;
	}

	public void setSizeClass(String sizeClass) {
		this.sizeClass = sizeClass;
	}

	public String getColorScheme() {
		return colorScheme;
	}

	public void setColorScheme(String colorScheme) {
		this.colorScheme = colorScheme;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
