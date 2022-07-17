package aula33;

import java.util.Scanner;

import aula33.ContaCorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		
		
		conta.setNumero("12345");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setValorEspecialUsado(0);
		conta.setSaldo(-10);
		//conta.deposito;
		
		System.out.println("Saldo da conta " + conta.getSaldo());

		
		boolean saqueEfetuado = conta.sacar(10);
				if (saqueEfetuado) { 
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta: " + conta.getSaldo());
		}else {
			System.out.println("Não foi possivel realizar o saque");
		}
		
		conta.depositar(500);
		System.out.println("Deposito de 500");
		conta.consultarSaldo();
				
	}

}
