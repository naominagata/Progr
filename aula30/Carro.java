package aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
		//atributo marca recebe o parametro marca
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consCombustivel = consCombustivel;
	}
	
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 parametros");
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parametros");
	}



	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + this.capCombustivel*this.consCombustivel + "km");
	}
	
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia");
		return this.capCombustivel*this.consCombustivel;
	}
	
	double calcularCombustivel (double km) {
		double qtdCombustivel = km * this.consCombustivel;
	    return qtdCombustivel;
	}
}
