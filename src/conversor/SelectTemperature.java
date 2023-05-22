package conversor;

public class SelectTemperature extends DefaultMenu{
	
	private static Object[] stringsTemperature = { "De Celsius para Farenheit", "De Farenheit para Celsius",
			"De Celsius para Kelvin", "De Kelvin para Celsius", "De Farenheit para Kelvin",
			"De Kelvin para Farenheit"};
	
	public SelectTemperature(Object[] getter) {
		super(getter);
	}

	public static Object[] getStringsTemperature() {
		return stringsTemperature;
	}

	@Override
	int EventListener() {
		return 0;
	}
	
}
