package conversor;

public class TestaConversor {
	public static void main(String[] args) {

		MainMenu menuInicial = new MainMenu(MainMenu.getStringsConverter(), "Selecione o conversor", "Menu");

		if (menuInicial.EventListener() == 1) {
			SelectExchange menuMoedas = new SelectExchange(SelectExchange.getStringsCurrency(), "Selecione o conversor",
					"Menu");
		} else {
			SelectTemperature menuTemperaturas = new SelectTemperature(SelectTemperature.getStringsTemperature(),
					"Selecione o conversor", "Menu");
		}

		InputDialog inputValue = new InputDialog(null, "Insira o valor desejado", "Input de valor");
	}
}
