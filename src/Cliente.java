

public class Cliente {
	private static Fachada fachada = new Fachada();
	
	public static void main(String[] args){
		fachada.criarProduto("Leite", "Betânia", 10.50);
	}
}
