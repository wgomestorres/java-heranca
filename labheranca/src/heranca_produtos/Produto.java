package heranca_produtos;

public class Produto {

	private String nome;
	private int qde;
	private float preco;

	public Produto(String nome, int qde, float preco) {
		this.nome = nome;
		this.preco = preco;
		this.qde = qde;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQde() {
		return qde;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
