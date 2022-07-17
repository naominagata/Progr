package aula24;

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
		
        Carro fusca = new Carro();
		
		van.marca = "Volkswagen";
		van.modelo = "Fusca";
		van.numPassageiros = 5;
		van.capCombustivel = 200;
		van.consCombustivel = 0.5;

		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}
