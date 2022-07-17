package aula19;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A[] = new int[2];
		int B[] = new int[A.length];
		int C[] = new int[A.length*2];
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Numero na posicao " + i + " no vetor A: ");
			A[i] = scan.nextInt();
			C[i] = A[i];
			System.out.println("Numero na posicao " + i + " no vetor B: ");
			B[i] = scan.nextInt();
			C[A.length+ i] = B[i];
		}
		
		for (int i=0; i<C.length; i++) {
			System.out.println(C[i]);
		}
		

	}

}
