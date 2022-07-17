package aula27;

import aula27.Carro;

public class TesteCarro {

public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		//criacao de variavel 
		double autonomia = van.obterAutonomia();
		
		System.out.println("Autonomia do carro é " + autonomia);
		//ou (mesma coisa ja que autonomia=van.obterAutonomia)
		System.out.println("Autonomia do carro é " + van.obterAutonomia());
		
		//criacao de variavel
		//km=10 (calcula a qtd de combustivel necessario)
		double qtdCombustivel = van.calcularCombustivel(10);
}
}
