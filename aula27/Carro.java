package aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro � " + capCombustivel*consCombustivel + "km");
	}
	
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia");
		return capCombustivel*consCombustivel;
	}
	
	double calcularCombustivel (double km) {
		double qtdCombustivel = km * consCombustivel;
	    return qtdCombustivel;
	}
}
