package conversor;

import javax.swing.JOptionPane;

public class SelectExchange extends DefaultMenu {

	private String selectedConverter = (String) JOptionPane.showInputDialog(null, "Selecione o conversor", "Menu",
			JOptionPane.PLAIN_MESSAGE, null, DefaultMenu.getStringsCurrency(), null);

	@Override
	String EventListener() {
		return "";
	}

	@Override
	String getSelectedConverter() {
		return this.selectedConverter;
	}
}
