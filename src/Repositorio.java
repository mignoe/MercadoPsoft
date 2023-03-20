import java.util.HashMap;

public class Repositorio {
	private HashMap<Integer, Produto> map = new HashMap<Integer, Produto>();
	
	public void add(Produto produto) {
		map.put(produto.getId(), produto);
	}
}
