package aula19;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int A[] = new int[5];
		int tabuada[] = new int[10];
		int resultado[] = new int[A.length * tabuada.length];
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Numero na posicao " + i + " no vetor A: ");
			A[i] = scan.nextInt();
			
			for (int j=1; j<=10; j++) {
				System.out.println(A[i] * j);
			}
		}
		
	}

}
