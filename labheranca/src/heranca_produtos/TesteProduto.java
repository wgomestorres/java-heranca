package heranca_produtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteProduto {

	public static void main(String[] args) {

		Eletronico eletronico = new Eletronico("Tablet", 6, 24.50f, "Samsung");
		Roupa roupa = new Roupa("Casaco", 8, 50.80f);
		Alimento alimento = new Alimento("Arroz", 10, 30);

		List<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(eletronico);
		listaProdutos.add(alimento);
		listaProdutos.add(roupa);

		Estoque estoque = new Estoque();

		System.out.println("Produtos");
		for (Produto produto : listaProdutos) {

			estoque.addProdutoEstoque(produto);

			if (produto instanceof Eletronico) {
				// Eletronico eletronicos = (Eletronico) produto;
				System.out.println("Eletronicos: " + produto.getNome() + " Quantidade: " + produto.getQde() + " Valor: "
						+ produto.getPreco() + " Marca: " + ((Eletronico) produto).getMarca());
				((Eletronico) produto).Listar();

			}
			if (produto instanceof Roupa) {
				Roupa roupas = (Roupa) produto;
				System.out.println("Roupas: " + roupas.getNome() + " Quantidade: " + roupas.getQde() + " Valor: "
						+ roupas.getPreco());

			}
			if (produto instanceof Alimento) {
				Alimento alimentos = (Alimento) produto;
				System.out.println("Alimentos: " + alimentos.getNome() + " Quantidade: " + alimentos.getQde()
						+ " Valor: " + alimentos.getPreco());

			}
			int x = estoque.listarQdeEstoque();
			System.out.println("Quantidade de produtos em estoque: " + x);

		}

	}

}
