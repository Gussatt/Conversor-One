package conversor;

public class TestaConversor {
	public static void main(String[] args) {		
		
		MainMenu menuInicial = new MainMenu(MainMenu.getStringsConverter());
		
		if (menuInicial.EventListener() == 1) {
			SelectExchange menuMoedas = new SelectExchange(SelectExchange.getStringsCurrency());
		} else {
			SelectTemperature menuTemperaturas = new SelectTemperature(SelectTemperature.getStringsTemperature());
		}
		
			
	}
}
