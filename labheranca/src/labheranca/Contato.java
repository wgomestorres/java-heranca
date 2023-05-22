package labheranca;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Contato {

	private String nome;
	private String telefone;
	private String email;

	List<Contato> contatos = new ArrayList<>();

	public Contato(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public void excluirContato(String nome, Map<String, Contato> maps) {
		Iterator<Map.Entry<String, Contato>> iterator = maps.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Contato> entry = iterator.next();
			String key = entry.getKey();
			if (key.equals(nome)) {
				System.out.println("Excluído do mapa: " + key);
				iterator.remove();
			}
		}

	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void addContato(Contato contato) {

		contatos.add(contato);

	}

	public List<Contato> listarContatos() {
		return this.contatos;

	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

}
