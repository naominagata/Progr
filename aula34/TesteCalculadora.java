package aula34;

public class TesteCalculadora {

	static int resultSoma;
	
	public static void main(String[] args) {

		
		
		//se eu coloco STATIC eu nao preciso instanciar 
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		resultSoma = MinhaCalculadora.soma(1, 2);
	}

}
