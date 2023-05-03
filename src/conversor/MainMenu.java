package conversor;

import javax.swing.JOptionPane;

public class MainMenu extends DefaultMenu {

	private Object[] converterStrings = { "Conversor de moedas", "Conversor de temperatura" };
	private String selectedConverter = (String) JOptionPane.showInputDialog(super.getFrameInicial(), "Selecione o conversor",
			"Menu", JOptionPane.PLAIN_MESSAGE, null, converterStrings, converterStrings[0]);
	
	@Override
	void ShowMenu() {
		System.out.println(selectedConverter);	
	}

	@Override
	String EventListener() {
		if(selectedConverter == null || selectedConverter.length() < 1) {
			throw new NullPointerException("Perdão, porém esta opção é inválida");
		}
		
		if(selectedConverter == "Conversor de moedas") {
			return "Conversor de moedas selecionado";
		} else {
			return "Conversor de temperatura selecionado";
		}	
	}
}
