package heranca_produtos;

public class Eletronico extends Produto {

	private String marca;

	public void Listar() {
		System.out.println("Eletronico ligado");

	}

	public Eletronico(String nome, int qde, float preco, String marca) {
		super(nome, qde, preco);
		this.marca = marca;

	}

	public String getMarca() {
		return marca;
	}


}
