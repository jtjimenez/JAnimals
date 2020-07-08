package jek.animals;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceLoader {

	private ResourceLoader() {

	}

	private static ResourceBundle bundle;

	public static void loadResourceBundle(Locale locale) {
		bundle = ResourceBundle.getBundle("animals", locale);
	}

	public static String get(String key) {
		if (bundle == null) {
			bundle = ResourceBundle.getBundle("animals");
		}
		return bundle.getString(key);
	}
}
