package aula34;

public class Calculadora {

	static int A, B;
	
	public static int Somar() {
		return A+B;
	}
	
	public static int Subtrair() {
		return A-B;
	}
	
	public static int Multiplicar() {
		return A*B;
	}
	
	public static int Dividir() {
		return A/B;
	}
	
	public static double Elevar() {
		return Math.pow(A, B);
	}
}
