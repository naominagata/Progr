package aula29;

import aula29.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
        Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consCombustivel = 0.2;

		System.out.println("Pela classe Carro o numero de passageiros é: " + van.numPassageiros);
		
		//parametro MARCA no construtor
		Carro van2 = new Carro("Fiat", "Ducato", 10);
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
	}

}
