package conversor;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class DefaultFrame extends JFrame{

	private static final long serialVersionUID = -3573155572291572774L;
	private DefaultFrame frameInicial = new DefaultFrame(200,200, false);

	public DefaultFrame getFrameInicial() {
		return frameInicial;
	}
	
	public DefaultFrame(int height, int width, boolean state){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(state);
		this.setSize(height, width);
	}
}
