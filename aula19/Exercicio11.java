package aula19;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int [] A = new int[10];
		int qtdPares =0;
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Valor de A na posicao " + i);
			A[i] = scan.nextInt();
		}
	 
		for (int i=0; i<A.length; i++) {
		 if (A[i] % 2 == 0) {
			 qtdPares++;
		 }
		}
		
		System.out.println("Quantidade de vetor pares: " + qtdPares);
		
		
	}

}
