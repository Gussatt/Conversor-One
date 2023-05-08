package conversor;

public abstract class DefaultMenu{
	
	private static Object[] stringsConverter = { "Conversor de moedas", "Conversor de temperatura" };
	private static Object[] stringsCurrency = {"De Reais para Dólares", "De Reais para Euros", "De Reais para Libras",
												"De Reais para Yenes", "De Reais para Won Coreano", 
												"De Dólares para Reais", "De Euros para Reais", "De Libras para Reias",
												"De Yenes para Reais", "De Won Coreano para Reais",};
	public static Object[] getStringsConverter() {
		return stringsConverter;
	}

	public static Object[] getStringsCurrency() {
		return stringsCurrency;
	}
	
	abstract String EventListener();
	
	abstract String getSelectedConverter();
}
