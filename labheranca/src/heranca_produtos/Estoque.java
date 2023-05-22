package heranca_produtos;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Produto> listaProdutos = new ArrayList<>();

	public void addProdutoEstoque(Produto produto) {

		listaProdutos.add(produto);

	}

	public List<Produto> listarProdutosEstoque() {
		return this.listaProdutos;

	}

	public int listarQdeEstoque() {
		int x = 0;
		// List<Integer> qdeEstoque = new ArrayList<>();

		for (Produto produto : listaProdutos) {

			x = produto.getQde() + x;
			/// qdeEstoque.add(x);

		}
		/*
		 * for (int i = 0; i < qdeEstoque.size(); i++) { int y = qdeEstoque.get(i) + y;
		 * 
		 * }
		 */
		return x;

	}

}
