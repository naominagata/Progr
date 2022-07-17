package aula27;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		
		
		conta.numero = "12345";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		//conta.deposito;
		
		System.out.println("Saldo da conta " + conta.saldo);

		
		boolean saqueEfetuado = conta.sacar(10);
				if (saqueEfetuado) { 
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta: " + conta.saldo);
		}else {
			System.out.println("Não foi possivel realizar o saque");
		}
		
		conta.depositar(500);
		System.out.println("Deposito de 500");
		conta.consultarSaldo();
				
				
	}

}
