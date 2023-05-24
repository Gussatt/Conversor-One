package conversor;

import javax.swing.JOptionPane;

public abstract class DefaultMenu {

	private String selectedConverter;
//	private ImageIcon questionIcon = new ImageIcon("icon/question.png", "Question mark");
	
	public DefaultMenu(Object[] getter, String message, String title) {
		this.selectedConverter = (String) JOptionPane.showInputDialog(null, message, title,
				JOptionPane.QUESTION_MESSAGE, null, getter, null);
	}
	
	public String getSelectedConverter() {
		return selectedConverter;
	}
	
	abstract int EventListener();
	
}
