package conversor;

public class SelectTemperature extends DefaultMenu{
	
	public SelectTemperature(Object[] getter, String message, String title) {
		super(getter, message, title);
	}

	private static Object[] stringsTemperature = { "De Celsius para Farenheit", "De Farenheit para Celsius",
			"De Celsius para Kelvin", "De Kelvin para Celsius", "De Farenheit para Kelvin",
			"De Kelvin para Farenheit"};
	

	public static Object[] getStringsTemperature() {
		return stringsTemperature;
	}

	@Override
	int EventListener() {
		return 0;
	}
	
}
