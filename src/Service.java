public class Service {
	private Repositorio repositorio = new Repositorio();
	
	public void criarProduto(String nome, String fabricante, double preco) {
		Produto p = new Produto(nome, fabricante, preco);
		repositorio.add(p);
	}
}
