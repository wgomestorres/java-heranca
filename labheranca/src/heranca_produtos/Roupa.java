package heranca_produtos;

public class Roupa extends Produto {
	private String nome;
	private int qdeEstoque;
	private float preco;
	
	

	public String getNome() {
		return nome;
	}



	public int getQdeEstoque() {
		return qdeEstoque;
	}



	public float getPreco() {
		return preco;
	}



	public Roupa(String nome, int qde, float preco) {
		super(nome, qde, preco);

	}

}
