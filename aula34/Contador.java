package aula34;

public class Contador {

	private static int valorCont;
	
	public Contador() {
		valorCont++;
	}
	
	public static void Zerar() { 
		valorCont = 0;
	}
	
	public static void Incrementar() {
		valorCont++;
	}
	
	public static int Retornar() {
		return valorCont;
	}
}
