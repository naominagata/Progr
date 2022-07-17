package aula19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int [] A = new int[5];
		int [] B = new int[5];
		
		for (int i=0; i<A.length ; i++) {
			System.out.println("Digite um valor da posicao " + i);
			A[i] = scan.nextInt();
			
			B[i] = A[i];
		}
			
			for (int i=0; i<A.length; i++) {
				System.out.println("Vetor A: " + A[i]);	
			}
			
			for (int i=0; i<B.length; i++) {
				System.out.println("Vetor B: " + B[i]);	
			}
		
	}

}
