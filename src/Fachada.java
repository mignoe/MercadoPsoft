
public class Fachada {
	private Service servico = new Service();
	
	public void criarProduto(String nome, String fabricante, double preco) {
		servico.criarProduto(nome, fabricante, preco);
	}
}
