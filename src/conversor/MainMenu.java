package conversor;

public class MainMenu extends DefaultMenu {
	
	public MainMenu(Object[] getter, String message, String title) {
		super(getter, message, title);
	}

	private static Object[] stringsConverter = { "Conversor de moedas", "Conversor de temperatura" };
	
	
	public static Object[] getStringsConverter() {
		return stringsConverter;
	}
	
	@Override
	int EventListener() {
		if (this.getSelectedConverter() == null || this.getSelectedConverter().length() < 1) {
			throw new NullPointerException("Perdão, porém esta opção é inválida");
		}

		if (this.getSelectedConverter() == "Conversor de moedas") {
			return 1;
		} else {
			return 2;
		}
	}
}
