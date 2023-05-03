package conversor;

public abstract class DefaultMenu{

	private DefaultFrame frameInicial = new DefaultFrame(200,200, false);
	
	abstract void ShowMenu();

	abstract String EventListener();
	
	public DefaultFrame getFrameInicial() {
		return frameInicial;
	}
}
