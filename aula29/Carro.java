package aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	Carro(){
		//colocar coisas que nao mudam durante o programa inteiro
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
	}
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
		//atributo marca recebe o parametro marca
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consCombustivel = consCombustivel;
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel*consCombustivel + "km");
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
