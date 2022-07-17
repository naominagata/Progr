package exercicio4;

import java.util.Scanner;

import filas.FilaPacientes;

public class ConsultorioPacientes {

	public static void main(String[] args) {
		
		FilaPacientes fila = new FilaPacientes();
		fila.init();
		Scanner le = new Scanner(System.in);
		int op;
		do {
			System.out.println("1 - insere paciente na fila");
			System.out.println("2 - chama paciente para atendimento");
			System.out.println("3 - Encerra atendimento do dia");
			System.out.print("   Opção: ");
			op = le.nextInt();
			switch (op) {
			case 1:
				System.out.print("Nome do paciente: ");
				String nome = le.next();
				System.out.print("Idade: ");
				int idade = le.nextInt();
				Paciente pac = new Paciente(nome, idade);
				//insere Paciente da fila
				fila.enqueue(pac);
				break;
			case 2:
				//retira paciente da fila 
				if (!fila.isEmpty())
					System.out.println("Paciente chamado para atendimento: " + fila.dequeue());
				break;
			case 3:
				if (!fila.isEmpty()) {
					System.out.println("Ainda há pacientes na fila");
					op = 0;
				}
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while(op!=3);
		le.close();
		System.out.println("Atendimento encerrado!");
	}

}
