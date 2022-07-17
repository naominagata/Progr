package exercicio2;

import java.util.Scanner;

import filas.FilaInt;

public class Processador {

	public static void main(String[] args) {

		FilaInt filaProcessos = new FilaInt();
		filaProcessos.init();
		Scanner le = new Scanner(System.in);
		int op;
		do {
			System.out.println("1- Submeter processo");
			System.out.println("2- Executar processo");
			System.out.println("3- Shutdown");
			op = le.nextInt();

			switch (op) {
			case 1:
				System.out.print("Informe pid: ");
				int pid = le.nextInt();
				filaProcessos.enqueue(pid);
				break;
			case 2:
				if (!filaProcessos.isEmpty()) {
					pid = filaProcessos.dequeue();
					System.out.println("Processo " + pid + " est� sendo executado");
					System.out.println("Processo foi conclu�do? (1-sim/ 2-n�o)");
					int resp = le.nextInt();
					if (resp == 2)
						filaProcessos.enqueue(pid);
					else
						System.out.println("Processo " + pid + " conclu�do");
				}
				break;
			case 3:
				if (filaProcessos.isEmpty())
					System.out.println("Shutdown...");
				else {
					System.out.println("Deseja encerrar todos os processos " + "em execu��o? (1-sim/2-n�o)");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!filaProcessos.isEmpty())
							System.out.println("Encerrando processo " + filaProcessos.dequeue());
						System.out.println("Shutdown...");
					} else
						op = 0;
				}
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
		} while (op != 3);
		le.close();
	}

}
