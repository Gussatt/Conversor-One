package conversor;

import javax.swing.JOptionPane;

public abstract class DefaultMenu {

	private String selectedConverter;

	public DefaultMenu(Object[] getter) {
		this.selectedConverter = (String) JOptionPane.showInputDialog(null, "Selecione o conversor", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, getter, null);
	}
	
	public String getSelectedConverter() {
		return selectedConverter;
	}
	
	abstract int EventListener();
	
	
}
