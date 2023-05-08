package conversor;

import javax.swing.JOptionPane;

public class MainMenu extends DefaultMenu {

	private String selectedConverter = (String) JOptionPane.showInputDialog(null, "Selecione o conversor", "Menu",
			JOptionPane.PLAIN_MESSAGE, null, DefaultMenu.getStringsConverter(), null);

	@Override
	String EventListener() {
		if (this.getSelectedConverter() == null || this.getSelectedConverter().length() < 1) {
			throw new NullPointerException("Perdão, porém esta opção é inválida");
		}

		if (this.getSelectedConverter() == "Conversor de moedas") {
			SelectExchange menuMoedas = new SelectExchange();
			return "Conversor de moedas selecionado";
		} else {
			return "Conversor de temperatura selecionado";
		}
	}

	@Override
	String getSelectedConverter() {
		return this.selectedConverter;
	}
}
