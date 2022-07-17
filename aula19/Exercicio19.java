package aula19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1 [] = new double[2];
		double nota2 [] = new double[nota1.length];
		double resultado [] = new double[nota1.length];

		for (int i=0; i<nota1.length; i++) {
			System.out.println("Digite a nota 1 do aluno " + i);
			nota1[i] = scan.nextDouble();
		}
		
		for (int i=0; i<nota2.length; i++) {
			System.out.println("Digite a nota 2 do aluno " + i);
			nota2[i] = scan.nextDouble();
		}
		
		for (int i=0; i<resultado.length; i++) {
			resultado[i] = (nota1[i]+nota2[i])/ 2;
			if (resultado[i]>=7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}
	}

}
