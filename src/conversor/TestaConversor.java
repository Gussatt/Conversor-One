package conversor;

public class TestaConversor {
	public static void main(String[] args) {
		DefaultFrame menuInicial = new DefaultFrame(200,200, false);
		menuInicial.showMenu();
		
		System.out.println(menuInicial.whichConverter());
	}
}
