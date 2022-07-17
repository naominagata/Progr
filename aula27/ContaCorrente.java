package aula27;

import java.util.Scanner;

public class ContaCorrente {

	Scanner scan = new Scanner(System.in);
	
	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	
	
	
	boolean sacar(double saque) {
		if (saldo >= saque) {
			saldo = saldo -= saque;
			return true;
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= saque) {
					saldo += saque;
					return true;
			}else {
				return false; 
			}
	} else {
		return false;
	}
	}
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: " + saldo);
	}
	
	boolean verificarChequeEspecial() {
		return saldo<0;
	}
	
	
}
