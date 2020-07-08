package jek.animals;

public abstract class Animal {

	private String sizeClass;
	private String colorScheme;
	private String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
