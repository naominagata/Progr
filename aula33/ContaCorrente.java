package aula33;

import java.util.Scanner;

public class ContaCorrente {

Scanner scan = new Scanner(System.in);
	
	private String numero;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ContaCorrente(Scanner scan, String numero, String agencia, double saldo, boolean especial,
			double limiteEspecial, double valorEspecialUsado) {
		this.scan = scan;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
	}


	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public boolean sacar(double saque) {
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
	
	public boolean verificarChequeEspecial() {
		return saldo<0;
	}
}
