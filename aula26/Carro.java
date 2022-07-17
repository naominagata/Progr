package aula26;

public class Carro {
		
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consCombustivel;
		
		public void exibirAutonomia() {
			System.out.println("A autonomia do carro é " + capCombustivel*consCombustivel + "km");
		}
		
		double obterAutonomia() {
			System.out.println("Metodo obterAutonomia");
			return capCombustivel*consCombustivel;
		}
			
}
