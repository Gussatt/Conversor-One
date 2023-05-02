package conversor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CaixaDeDialogo {
	
	private JFrame frameInicial = new JFrame();
	private Object[] converterStrings = { "Conversor de moedas", "Conversor de temperatura" };
	private String selectedConverter = (String) JOptionPane.showInputDialog(frameInicial, "Selecione o conversor",
			"Menu", JOptionPane.PLAIN_MESSAGE, null, converterStrings, converterStrings[0]);

	public void showMenu() {
		System.out.println(selectedConverter);
	}
	
	public String whichConverter() {
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
