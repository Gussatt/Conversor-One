package conversor;

public class SelectExchange extends DefaultMenu {

	public SelectExchange(Object[] getter, String message, String title) {
		super(getter, message, title);
	}

	private static Object[] stringsCurrency = { "De Reais para Dólares", "De Reais para Euros", "De Reais para Libras",
			"De Reais para Yenes", "De Reais para Won Coreano", "De Dólares para Reais", "De Euros para Reais",
			"De Libras para Reias", "De Yenes para Reais", "De Won Coreano para Reais", };
	

	public static Object[] getStringsCurrency() {
		return stringsCurrency;
	}

	@Override
	int EventListener() {
		return 0;
	}
}
