package aula36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		System.out.println("Insira o nome da agenda: ");
		agenda.setNome(scan.next());
		
		ContatoAgenda[] contato = new ContatoAgenda[3];
		for (int i=0; i<3; i++) {
			System.out.println("Entre com as info do contato: ");
			Contato c = new Contato();
			
			System.out.println("Nome: ");
			String nome = scan.next();
			c.setNome(nome);
			System.out.println("Telefone: ");
			String telefone = scan.next();
			c.setTelefone(telefone);
			System.out.println("email: ");
			String email = scan.next();
			
		}
		
		ContatoAgenda contato1 = new ContatoAgenda();
		
		contato1.setNome("Carol");
		contato1.setTelefone("9 9999-9999");
		contato1.setEmail("bla@gmail");
		
        ContatoAgenda contato2 = new ContatoAgenda();
		
		contato2.setNome("Cecilia");
		contato2.setTelefone("9 2222-2222");
		contato2.setEmail("cec@gmail");
		
        ContatoAgenda contato3 = new ContatoAgenda();
		
		contato3.setNome("Juliana");
		contato3.setTelefone("9 5555-5555");
		contato3.setEmail("enz@gmail");
		
		

		System.out.println("Nome agenda: " + agenda.getNome());
	}

}
