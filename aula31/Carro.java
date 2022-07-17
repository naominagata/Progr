package aula31;

//default - visivel dentro do pacote
//public - visivel para todos os pacotes
//private - visivel somente dentro da propria classe
public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + this.capCombustivel*this.consCombustivel + "km");
	}
	
	public double obterAutonomia() {
		System.out.println("Metodo obterAutonomia");
		return this.capCombustivel*this.consCombustivel;
	}
	
	public double calcularCombustivel (double km) {
		double qtdCombustivel = km * this.consCombustivel;
	    return qtdCombustivel;
	}
}
