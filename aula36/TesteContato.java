package aula36;

public class TesteContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contato contato = new Contato();
		
		contato.setNome("Naomi");
		//contato.setEndereco("Rua MF");
		//contato.setTelefone("9 8888-8888");
		
		//criar objeto endereco 
		Endereco end = new Endereco();
		//relacionamento tem um endereco
		end.setNomeRua("Rua AB");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("SP");
		end.setCep("9999999");
		
		contato.setEndereco(end);
		//em vez de obter as informacoes do endereco, ele vai dar a referencia do objeto  
		
		//relacionamento tem um telefone
		Telefone tel1 = new Telefone();
		tel1.setTipo("Celular");
		tel1.setDdd("11");
		tel1.setNumero("9 8888-8888");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Casa");
		tel2.setDdd("19");
		tel2.setNumero("9 4444-4444");
		
		Telefone[] telefone = new Telefone[2];
		telefone[0] = tel1;
		telefone[1] = tel2;
		
		contato.setTelefone(telefone);
		
		System.out.println(contato.getNome());
		System.out.println(contato.getTelefone());
		//se eu nao fizer o set endereco, o get endereco fica nulo
		//assim o get cidade tb vai ficar nulo VAI DAR ERRO
		if (contato != null && contato.getEndereco() !=null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		/*if (contato!=null && contato.getTelefone()!=null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero() + " " + contato.getTelefone().getTipo() + " ");
		}*/
		
		if (contato!=null && contato.getTelefone()!=null) {
			for (Telefone t : contato.getTelefone())
			System.out.println(t.getDdd() + " " + t.getNumero() + " " + t.getTipo() + " ");
		}
	}

}
