package labheranca;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteAgenda {

	public static void main(String[] args) {
		List<Contato> listaContatos = new ArrayList<>();

		Contato contato1 = new Contato("Joana", "99326482", "wallandgomes@hotmail.com");
		listaContatos.add(contato1);
		Contato contato2 = new Contato("Lucas", "11223344", "gomes@hotmail.com");
		listaContatos.add(contato2);
		Contato contato3 = new Contato("Gustavo", "44554455", "torres@hotmail.com");
		listaContatos.add(contato3);
		Contato contato4 = new Contato("Alberto", "88990088", "walland@hotmail.com");
		listaContatos.add(contato4);

		Map<String, Contato> agenda = new HashMap<>();

		for (Contato contatos : listaContatos) {
			agenda.put(contatos.getNome(), contatos);

		}
		Contato agendas;
		for (Map.Entry<String, Contato> entry : agenda.entrySet()) {
			String nome = entry.getKey();
			agendas = entry.getValue();
			System.out.println("Contatos da Agenda:");
			System.out
					.println("Nome: " + nome + " Telefone: " + agendas.getTelefone() + " Email: " + agendas.getEmail());
		}
		contato1.excluirContato("Alberto", agenda);
		System.out.println("------------------------------------------------------------------");
		for (Map.Entry<String, Contato> entry : agenda.entrySet()) {
			String nome = entry.getKey();
			agendas = entry.getValue();
			System.out.println("Contatos da Agenda:");
			System.out
					.println("Nome: " + nome + " Telefone: " + agendas.getTelefone() + " Email: " + agendas.getEmail());
		}

	}

}
