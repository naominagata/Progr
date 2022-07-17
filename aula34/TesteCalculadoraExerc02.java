package aula34;

import java.util.Scanner;

public class TesteCalculadoraExerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		Calculadora.A = scan.nextInt();
		
		System.out.println("Número 2: ");
		Calculadora.B = scan.nextInt();
		
		System.out.println(Calculadora.Somar());
		System.out.println(Calculadora.Subtrair());
		System.out.println(Calculadora.Multiplicar());
		System.out.println(Calculadora.Dividir());
		System.out.println(Calculadora.Elevar());
	}

}
