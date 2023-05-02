package conversor;

public class TestaConversor {
	public static void main(String[] args) {
		CaixaDeDialogo menuInicial = new CaixaDeDialogo();
		menuInicial.showMenu();
		
		System.out.println(menuInicial.whichConverter());
	}
}
